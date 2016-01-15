package cn.guLang.utils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import cn.guLang.utils.LogUtils;
import cn.trinea.android.common.util.PreferencesUtils;

/**
 * 基础工具类
 *
 * @author 幸福
 * @data 2015-1-4
 */
public class BaseTools {
	private static int curVersionCode;

	/**
	 * 显示没有标题栏
	 */
	public static void showNoTitle(Activity activity) {
		activity.requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	/**
	 * 显示没有标题栏和全屏
	 */
	public static void showFullScreen(Activity activity) {
		activity.requestWindowFeature(Window.FEATURE_NO_TITLE);
		activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}

	/**
	 * 检查是否存在SDCard
	 *
	 * @return
	 */
	public static boolean hasSdcard() {
		String state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 检测网络是否可用
	 *
	 * @param context
	 * @return
	 */
	public static boolean isNetWorkConnected(Context context) {
		if (context != null) {
			ConnectivityManager mConnectivityManager = (ConnectivityManager) context
					.getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
			if (mNetworkInfo != null) {
				return mNetworkInfo.isAvailable();
			}
		}

		return false;
	}

	// 隐藏虚拟键盘
	public static void hideKeyboard(View v) {
		InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
		if (imm.isActive()) {
			imm.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);

		}
	}

	// 显示虚拟键盘
	public static void showKeyboard(View v) {
		InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);

		imm.showSoftInput(v, InputMethodManager.SHOW_FORCED);
	}

	/**
	 * @see //http://blog.sina.com.cn/s/blog_886585830100xk66.html
	 * @return true 代表输入的内容是邮箱
	 */
	public static boolean isEmail(String email) {
		String str = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	/**
	 *
	 * @return true 代表输入的是手机号
	 */
	public static boolean isPhoneNumber(String phone) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
		Matcher m = p.matcher(phone);
		return m.matches();
	}

	// 获取资源字符串
	public static String getString(Context context, int resId) {
		return context.getResources().getString(resId);
	}

	// 获取状态栏的高度
	public static int getStateHeight(Activity context) {
		Rect frame = new Rect();
		context.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;
		return statusBarHeight;

	}

	// 字母排序，ABCDEFHIJKLMNOPQRSTUVWXYZ
	public static String charSort(String string) {
		// 将字符串转换成char数组
		char[] c = string.toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		return sb.toString();

	}

	// 获取屏幕宽高
	public static Display getWindow(Activity activity) {
		WindowManager wm = (WindowManager) activity.getSystemService(Context.WINDOW_SERVICE);
		return wm.getDefaultDisplay();
	}

	// 获取路径
	public static String getPath(Bitmap photo, String filename) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ByteArrayOutputStream baos = null;
		String saveDir = Environment.getExternalStorageDirectory() + "/hunba";
		try {
			int options = 100;
			baos = new ByteArrayOutputStream();
			photo.compress(Bitmap.CompressFormat.JPEG, options, baos);
			byte[] byteArray = baos.toByteArray();
			if (baos.toByteArray().length / 1024 > 512) { // 循环判断如果压缩后图片是否大于100kb,大于继续压缩
				baos.reset();// 重置baos即清空baos
				photo.compress(Bitmap.CompressFormat.JPEG, options, baos);// 这里压缩options%，把压缩后的数据存放到baos中
				LogUtils.e("压缩", options + "/" + baos.toByteArray().length);
				options -= 10;// 每次都减少10
			}
			LogUtils.e("保存", baos.toByteArray().length + "");
			File dir = new File(saveDir);
			if (!dir.exists()) {
				dir.mkdir();
			}
			File file = new File(saveDir, filename);
			file.delete();
			if (!file.exists()) {
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			bos.write(byteArray);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (baos != null) {
				try {
					baos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		String path = saveDir + "/" + filename;
		return path;

	}

	/**
	 * 获取当前客户端版本信息
	 *
	 * @param activity
	 */
	public static int getCurrentVersion(Activity activity) {
		try {
			PackageInfo info = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
			String curVersionName = info.versionName;
			curVersionCode = info.versionCode;
			LogUtils.e("版本号：", curVersionCode + "/" + curVersionName);
		} catch (NameNotFoundException e) {
			e.printStackTrace(System.err);
		}
		return curVersionCode;
	}

	/**
	 * 清除保存的信息
	 *
	 * @param activity
	 */
	public static void clearPreference(Activity activity) {
		SharedPreferences sp = activity.getSharedPreferences(PreferencesUtils.PREFERENCE_NAME, Context.MODE_PRIVATE);
		Editor edtior = sp.edit();
		edtior.clear();
		edtior.commit();
	}
}
