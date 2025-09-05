package com.aliendroid.alienads;

import android.app.Activity;
import android.util.Log;

import com.aliendroid.alienads.config.AudienceNetworkInitializeHelper;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

import java.util.Map;


public class AliendroidInitialize {
    public static void SelectAdsAdmobTargeting(Activity activity, String selectAdsBackup, String idInitialize, String type) {
    }
    public static void SelectAdsAdmob(Activity activity, String selectAdsBackup, String idInitialize) {
    }

    public static void SelectAdsGoogleAds(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsApplovinDis(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsApplovinMax(Activity activity, String selectAdsBackup, String idInitialize) {
    }

    public static void SelectAdsMopub(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsStartApp(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {
    }

    public static void SelectAdsIron(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {
    }

    public static void SelectAdsUnity(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }


    public static void SelectAdsFAN(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {
        if (!AudienceNetworkAds.isInitialized(activity)) {

            AudienceNetworkAds
                    .buildInitSettings(activity)
                    .withInitListener(new AudienceNetworkInitializeHelper())
                    .initialize();
        }
    }

    public static void SelectAdsAlienView(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {
    }

    public static void SelectAdsAlienMediation(Activity activity, String selectAdsBackup,String idInitialize, String idInitializeBackupAds) {
        if (selectAdsBackup.equals("FACEBOOK")){
            if (!AudienceNetworkAds.isInitialized(activity)) {

                AudienceNetworkAds
                        .buildInitSettings(activity)
                        .withInitListener(new AudienceNetworkInitializeHelper())
                        .initialize();
            }

        }
    }

    public static void SelectAdsWortise(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

}
