package cn.guLang.utils;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/**
 * 广播控制器
 *
 * @author 幸福
 *
 */
public class BroadcastController {
	/**
	 * 发送广播
	 *
	 * @param context
	 *            上下文
	 * */
	public static void sendDataChangeBroadcase(Context context, String action) {
		context.sendBroadcast(new Intent(action));
		LogUtils.e("","发送广播：" + action);
	}

	/**
	 * 注册广播
	 *
	 * @param context
	 *            上下文
	 * @param receiver
	 *            接收器
	 * */
	public static void registerDataChangeReceiver(Context context,
												  BroadcastReceiver receiver, String action) {
		IntentFilter filter = new IntentFilter(action);
		context.registerReceiver(receiver, filter);
		LogUtils.e("", "接受广播：" + action);
	}

	/**
	 * 销毁广播
	 *
	 * @param context
	 *            上下文
	 * @param receiver
	 *            接收器
	 * */
	public static void unregisterReceiver(Context context,
										  BroadcastReceiver receiver) {
		try {
			context.unregisterReceiver(receiver);
			LogUtils.e("","销毁广播：");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}