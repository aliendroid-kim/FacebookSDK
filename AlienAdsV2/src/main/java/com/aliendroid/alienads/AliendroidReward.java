package com.aliendroid.alienads;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsAdmob;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsAlienView;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsApplovinDiscovery;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsApplovinMax;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsGoogle;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsIronSource;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsStartApp;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAdmob;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAlienMedition;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAlienView;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsApplovinDiscovery;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsGoogle;
import com.aliendroid.sdkads.interfaces.OnLoadRewardsMediation;
import com.aliendroid.sdkads.interfaces.OnLoadRewardsView;
import com.aliendroid.sdkads.interfaces.OnShowInterstitialView;
import com.aliendroid.sdkads.interfaces.OnShowRewards;
import com.aliendroid.sdkads.interfaces.OnShowRewardsView;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.facebook.ads.Ad;
import com.facebook.ads.RewardedVideoAd;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.props.adsmanager.PropsAdsManagement;

import java.util.Map;

public class AliendroidReward {
    public static RewardedVideoAd rewardedVideoAdFan;
    public static boolean unlockreward = false;
    public static OnLoadRewardsAdmob onLoadRewardsAdmob;
    public static OnLoadRewardsStartApp onLoadRewardsStartApp;
    public static OnLoadRewardsGoogle onLoadRewardsGoogle;
    public static OnLoadRewardsApplovinDiscovery onLoadRewardsApplovinDiscovery;
    public static OnLoadRewardsApplovinMax onLoadRewardsApplovinMax;
    public static OnLoadRewardsIronSource onLoadRewardsIronSource;
    public static OnLoadRewardsMediation onLoadRewardsMediation;
    public static OnLoadRewardsAlienView onLoadRewardsAlienView;

    public static OnShowRewardsAdmob onShowRewardsAdmob;
    public static OnShowRewardsGoogle onShowRewardsGoogle;
    public static OnShowRewardsApplovinDiscovery onShowRewardsApplovinDiscovery;
    public static OnShowRewardsAlienMedition onShowRewardsAlienMedition;
    public static OnShowRewardsAlienView onShowRewardsAlienView;

    public static boolean SHOW_ALIEN_VIEW=false;
    public static void LoadRewardAdmob(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardAlienView(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {


    }

    public static void LoadRewardUnity(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardGoogleAds(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }


    public static void LoadRewardApplovinMax(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardApplovinDis(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardMopub(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardStartApp(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardAdmob(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardGoogleAds(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardApplovinMax(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardApplovinDis(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardMopub(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardUnity(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardStartApp(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardAlienView(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardFan(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
        try {

            rewardedVideoAdFan = new RewardedVideoAd(activity, idReward);
            com.facebook.ads.RewardedVideoAdListener rewardedVideoAdListener = new com.facebook.ads.RewardedVideoAdListener() {

                @Override
                public void onError(Ad ad, com.facebook.ads.AdError adError) {

                }

                @Override
                public void onAdLoaded(Ad ad) {
                    // Rewarded video ad is loaded and ready to be displayed
                    Log.d(TAG, "Rewarded video ad is loaded and ready to be displayed!");
                }

                @Override
                public void onAdClicked(Ad ad) {
                    // Rewarded video ad clicked
                    Log.d(TAG, "Rewarded video ad clicked!");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    // Rewarded Video ad impression - the event will fire when the
                    // video starts playing
                    Log.d(TAG, "Rewarded video ad impression logged!");
                }

                @Override
                public void onRewardedVideoCompleted() {
                    unlockreward = true;
                }

                @Override
                public void onRewardedVideoClosed() {
                    // The Rewarded Video ad was closed - this can occur during the video
                    // by closing the app, or closing the end card.
                    Log.d(TAG, "Rewarded video ad closed!");
                }
            };
            rewardedVideoAdFan.loadAd(
                    rewardedVideoAdFan.buildLoadAdConfig()
                            .withAdListener(rewardedVideoAdListener)
                            .build());

            if (selectBackupAds.equals("ALIEN-M")) {
                PropsAdsManagement.loadRewardedAds(activity, idBackupReward, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        Log.i(TAG, "testing rewarded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void ShowRewardFan(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        try {
            if (rewardedVideoAdFan == null || !rewardedVideoAdFan.isAdLoaded()) {
                if (selecBackuptAds.equals("ALIEN-M")) {
                    if (PropsAdsManagement.getRewardedAds() != null) {
                        PropsAdsManagement.triggerRewardedAds(activity, new OnUserEarnedRewardListener() {
                            @Override
                            public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                                unlockreward = true;
                            }
                        });
                    }
                }
            } else {
                rewardedVideoAdFan.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadRewardFan(activity, selecBackuptAds, idReward, idBackupReward);
    }
    public static void LoadRewardAlienMediation(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
        try {
            PropsAdsManagement.loadRewardedAds(activity, idReward, new RewardedAdLoadCallback() {
                @Override
                public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                    Log.i(TAG, "testing rewarded");
                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    // Handle the error
                }
            });
            switch (selectBackupAds) {
                case "FACEBOOK":
                    rewardedVideoAdFan = new RewardedVideoAd(activity, idBackupReward);
                    com.facebook.ads.RewardedVideoAdListener rewardedVideoAdListener2 = new com.facebook.ads.RewardedVideoAdListener() {

                        @Override
                        public void onError(Ad ad, com.facebook.ads.AdError adError) {

                        }

                        @Override
                        public void onAdLoaded(Ad ad) {
                            // Rewarded video ad is loaded and ready to be displayed
                            Log.d(TAG, "Rewarded video ad is loaded and ready to be displayed!");
                        }

                        @Override
                        public void onAdClicked(Ad ad) {
                            // Rewarded video ad clicked
                            Log.d(TAG, "Rewarded video ad clicked!");
                        }

                        @Override
                        public void onLoggingImpression(Ad ad) {
                            // Rewarded Video ad impression - the event will fire when the
                            // video starts playing
                            Log.d(TAG, "Rewarded video ad impression logged!");
                        }

                        @Override
                        public void onRewardedVideoCompleted() {
                            unlockreward = true;
                        }

                        @Override
                        public void onRewardedVideoClosed() {
                            // The Rewarded Video ad was closed - this can occur during the video
                            // by closing the app, or closing the end card.
                            Log.d(TAG, "Rewarded video ad closed!");
                        }
                    };
                    rewardedVideoAdFan.loadAd(
                            rewardedVideoAdFan.buildLoadAdConfig()
                                    .withAdListener(rewardedVideoAdListener2)
                                    .build());
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void ShowRewardAlienMediation(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        try {
            if (PropsAdsManagement.getRewardedAds() != null) {
                PropsAdsManagement.triggerRewardedAds(activity, new OnUserEarnedRewardListener() {
                    @Override
                    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                        unlockreward = true;
                    }
                });
            } else {
                if (selecBackuptAds.equals("FACEBOOK")) {
                    if (rewardedVideoAdFan.isAdLoaded()) {
                        rewardedVideoAdFan.show();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadRewardAlienMediation(activity, selecBackuptAds, idReward, idBackupReward);
    }
}
