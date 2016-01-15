package cn.guLang.china;

import java.lang.ref.WeakReference;
import java.util.Stack;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public class CustomApplication extends Application {
    /***
     * �Ĵ�����Ӧ��Activity
     **/
    private final Stack<WeakReference<Activity>> activitys = new Stack<WeakReference<Activity>>();
    //��ȡȫ��Context
    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initTUSDK();
    }

    private void initTUSDK() {
        // ��ʼ��ȫ�ֱ���
//		TuSdk.enableDebugLog(true);
//		// ����ID (��ǰ�� http://tusdk.com ��ȡ����APP ������Կ)
//		TuSdk.init(this.getApplicationContext(), ConstantBean.TUSDK);
    }

    /**
     * ��Activityѹ��Applicationջ
     *
     * @param task ��Ҫѹ��ջ��Activity����
     */
    public void pushTask(WeakReference<Activity> task) {
        activitys.push(task);
    }

    /**
     * �������Activity�����ջ���Ƴ�
     *
     * @param task
     */
    public void removeTask(WeakReference<Activity> task) {
        activitys.remove(task);
    }

    /**
     * ����ָ��λ�ô�ջ���Ƴ�Activity
     *
     * @param taskIndex Activityջ����
     */
    public void removeTask(int taskIndex) {
        if (activitys.size() > taskIndex)
            activitys.remove(taskIndex);
    }

    /**
     * ��ջ��Activity�Ƴ���ջ��
     */
    public void removeToTop() {
        int end = activitys.size();
        int start = 1;
        for (int i = end - 1; i >= start; i--) {
            if (!activitys.get(i).get().isFinishing()) {
                activitys.get(i).get().finish();
            }
        }
    }

    /**
     * �Ƴ�ȫ������������Ӧ���˳���
     */
    public void removeAll() {
        // finish���е�Activity
        for (WeakReference<Activity> task : activitys) {
            if (!task.get().isFinishing()) {
                task.get().finish();
            }
        }
    }
}
