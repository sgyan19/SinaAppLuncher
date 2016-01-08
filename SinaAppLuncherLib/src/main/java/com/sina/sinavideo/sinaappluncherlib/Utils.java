package com.sina.sinavideo.sinaappluncherlib;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sinash94857 on 2016/1/8.
 */
public class Utils {

    public static List<SALInfo> getTestData(){
        List<SALInfo> list = new ArrayList<>();

        int index = 0;
        SALInfo info;

        info = new SALInfo();
        info.appName = "新浪视频";
        info.packageName = "com.sina.sinavideo";
        info.appId = index++;
        info.appIcon = R.drawable.sinavideo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪体育";
        info.packageName = "cn.com.sina.sports";
        info.appId = index++;
        info.appIcon = R.drawable.sinasports_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪微博";
        info.packageName = "com.sina.weibo";
        info.appId = index++;
        info.appIcon = R.drawable.sinaweibo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪视频";
        info.packageName = "com.sina.sinavideo";
        info.appId = index++;
        info.appIcon = R.drawable.sinavideo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪体育";
        info.packageName = "cn.com.sina.sports";
        info.appId = index++;
        info.appIcon = R.drawable.sinasports_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪微博";
        info.packageName = "com.sina.weibo";
        info.appId = index++;
        info.appIcon = R.drawable.sinaweibo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪视频";
        info.packageName = "com.sina.sinavideo";
        info.appId = index++;
        info.appIcon = R.drawable.sinavideo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪体育";
        info.packageName = "cn.com.sina.sports";
        info.appId = index++;
        info.appIcon = R.drawable.sinasports_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪微博";
        info.packageName = "com.sina.weibo";
        info.appId = index++;
        info.appIcon = R.drawable.sinaweibo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪视频";
        info.packageName = "com.sina.sinavideo";
        info.appId = index++;
        info.appIcon = R.drawable.sinavideo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪体育";
        info.packageName = "cn.com.sina.sports";
        info.appId = index++;
        info.appIcon = R.drawable.sinasports_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪微博";
        info.packageName = "com.sina.weibo";
        info.appId = index++;
        info.appIcon = R.drawable.sinaweibo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪视频";
        info.packageName = "com.sina.sinavideo";
        info.appId = index++;
        info.appIcon = R.drawable.sinavideo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪体育";
        info.packageName = "cn.com.sina.sports";
        info.appId = index++;
        info.appIcon = R.drawable.sinasports_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪微博";
        info.packageName = "com.sina.weibo";
        info.appId = index++;
        info.appIcon = R.drawable.sinaweibo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪视频";
        info.packageName = "com.sina.sinavideo";
        info.appId = index++;
        info.appIcon = R.drawable.sinavideo_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪体育";
        info.packageName = "cn.com.sina.sports";
        info.appId = index++;
        info.appIcon = R.drawable.sinasports_icon;
        list.add(info);

        info = new SALInfo();
        info.appName = "新浪微博";
        info.packageName = "com.sina.weibo";
        info.appId = index++;
        info.appIcon = R.drawable.sinaweibo_icon;
        list.add(info);
        return list;
    }

    // 通过包名检测系统中是否安装某个应用程序
    public static boolean checkApkExist(Context context, String packageName) {
        if (packageName == null || "".equals(packageName)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(packageName,
                    PackageManager.GET_UNINSTALLED_PACKAGES);
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    // 通过包名检测系统中是否安装某个应用程序
    public static void checkApkExist(Context context, List<SALInfo> sALInfos) {
        List<ApplicationInfo> infos =context.getPackageManager().getInstalledApplications(PackageManager.GET_UNINSTALLED_PACKAGES);
        for(ApplicationInfo info : infos){
            for(SALInfo item : sALInfos){
                if(info.packageName.equals(item.packageName)){
                    item.isInstall = true;
                    break;
                }
            }
        }
    }

    // 通过包名检测系统中是否安装某个应用程序
    public static boolean[] checkApkExist(Context context, String[] packageNames) {
        boolean[] result = new boolean[packageNames.length];
        List<ApplicationInfo> infos =context.getPackageManager().getInstalledApplications(PackageManager.GET_UNINSTALLED_PACKAGES);
        for(ApplicationInfo info : infos){
            for(int i = 0; i < packageNames.length ; i++){
                if(info.packageName.equals(packageNames[i])){
                    result[i] = true;
                    break;
                }
            }
        }
        return result;
    }
}
