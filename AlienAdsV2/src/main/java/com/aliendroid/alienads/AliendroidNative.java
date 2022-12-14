package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesStartApp;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesStartApp;
import com.aliendroid.sdkads.interfaces.OnLoadNative;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.bumptech.glide.Glide;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AliendroidNative {


    private static NativeAdLayout nativeAdLayout;
    private static LinearLayout adView;
    private static NativeBannerAd nativeBannerAd;
    public static com.facebook.ads.NativeAd nativeAdfan;
    public static OnLoadSmallNativesAdmob onLoadSmallNativesAdmob;
    public static OnLoadSmallNativesApplovinMax onLoadSmallNativesApplovinMax;
    public static OnLoadSmallNativesFacebook onLoadSmallNativesFacebook;
    public static OnLoadSmallNativesStartApp onLoadSmallNativesStartApp;
    public static OnLoadSmallNativesAlien onLoadSmallNativesAlien;

    public static OnLoadMediumNativesAdmob onLoadMediumNativesAdmob;
    public static OnLoadMediumNativesApplovinMax onLoadMediumNativesApplovinMax;
    public static OnLoadMediumNativesFacebook onLoadMediumNativesFacebook;
    public static OnLoadMediumNativesStartApp onLoadMediumNativesStartApp;
    public static OnLoadMediumNativesAlien onLoadMediumNativesAlien;

    public static void SmallNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void SmallNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void SmallNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
        nativeBannerAd = new NativeBannerAd(activity, nativeId);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            if (onLoadSmallNativesFacebook !=null){
                onLoadSmallNativesFacebook.onMediaDownloaded();
            }
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                if (onLoadSmallNativesFacebook !=null){
                    onLoadSmallNativesFacebook.onError("");
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                if (onLoadSmallNativesFacebook !=null){
                    onLoadSmallNativesFacebook.onAdLoaded();
                }
                if (nativeBannerAd == null || nativeBannerAd != ad) {
                    return;
                }
                inflateAd(nativeBannerAd, activity, layNative);
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };
        nativeBannerAd.loadAd(
                nativeBannerAd.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }


    public static void SmallNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void MediumNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void MediumNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
        nativeAdfan = new com.facebook.ads.NativeAd(activity, nativeId);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                if (onLoadMediumNativesFacebook!=null){
                    onLoadMediumNativesFacebook.onMediaDownloaded();
                }
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                if (onLoadMediumNativesFacebook!=null){
                    onLoadMediumNativesFacebook.onError("");
                }

            }

            @Override
            public void onAdLoaded(Ad ad) {
                if (onLoadMediumNativesFacebook!=null){
                    onLoadMediumNativesFacebook.onAdLoaded();
                }
                if (nativeAdfan == null || nativeAdfan != ad) {
                    return;
                }
                inflateAd2(nativeAdfan, activity, layNative);
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };

        nativeAdfan.loadAd(
                nativeAdfan.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());

    }

    public static void MediumNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void inflateAd(NativeBannerAd nativeBannerAd, Activity activity, RelativeLayout layNative) {
        try {
            nativeBannerAd.unregisterView();
            nativeAdLayout = new NativeAdLayout(activity, null, 1);
            LayoutInflater inflater = LayoutInflater.from(activity);
            adView = (LinearLayout) inflater.inflate(R.layout.fan_small_native, nativeAdLayout, false);
            layNative.addView(adView);

            RelativeLayout adChoicesContainer = adView.findViewById(R.id.ad_choices_container);
            AdOptionsView adOptionsView = new AdOptionsView(activity, nativeBannerAd, nativeAdLayout);
            adChoicesContainer.removeAllViews();
            adChoicesContainer.addView(adOptionsView, 0);

            TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
            TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
            TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
            com.facebook.ads.MediaView nativeAdIconView = adView.findViewById(R.id.native_icon_view);
            Button nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

            nativeAdCallToAction.setText(nativeBannerAd.getAdCallToAction());
            nativeAdCallToAction.setVisibility(
                    nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
            nativeAdTitle.setText(nativeBannerAd.getAdvertiserName());
            nativeAdSocialContext.setText(nativeBannerAd.getAdSocialContext());
            sponsoredLabel.setText(nativeBannerAd.getSponsoredTranslation());

            List<View> clickableViews = new ArrayList<>();
            clickableViews.add(nativeAdTitle);
            clickableViews.add(nativeAdCallToAction);
            nativeBannerAd.registerViewForInteraction(adView, nativeAdIconView, clickableViews);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void inflateAd2(com.facebook.ads.NativeAd nativeAdfan, Activity activity, RelativeLayout layNative) {
        try {
            nativeAdfan.unregisterView();
            nativeAdLayout = new NativeAdLayout(activity, null, 1);
            LayoutInflater inflater = LayoutInflater.from(activity);
            adView = (LinearLayout) inflater.inflate(R.layout.fan_medium_native, nativeAdLayout, false);
            layNative.addView(adView);

            LinearLayout adChoicesContainer = adView.findViewById(R.id.ad_choices_container);
            AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAdfan, nativeAdLayout);
            adChoicesContainer.removeAllViews();
            adChoicesContainer.addView(adOptionsView, 0);

            com.facebook.ads.MediaView nativeAdIcon = adView.findViewById(R.id.native_ad_icon);
            TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
            com.facebook.ads.MediaView nativeAdMedia = adView.findViewById(R.id.native_ad_media);
            TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
            TextView nativeAdBody = adView.findViewById(R.id.native_ad_body);
            TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
            Button nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

            nativeAdTitle.setText(nativeAdfan.getAdvertiserName());
            nativeAdBody.setText(nativeAdfan.getAdBodyText());
            nativeAdSocialContext.setText(nativeAdfan.getAdSocialContext());
            nativeAdCallToAction.setVisibility(nativeAdfan.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
            nativeAdCallToAction.setText(nativeAdfan.getAdCallToAction());
            sponsoredLabel.setText(nativeAdfan.getSponsoredTranslation());

            List<View> clickableViews = new ArrayList<>();
            clickableViews.add(nativeAdTitle);
            clickableViews.add(nativeAdCallToAction);

            nativeAdfan.registerViewForInteraction(
                    adView, nativeAdMedia, nativeAdIcon, clickableViews);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
