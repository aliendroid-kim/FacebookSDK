package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAdmob;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAlienMediation;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAlienView;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerApplovinDiscovery;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerApplovinMax;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerFacebook;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerGoogle;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerIronSource;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerStartApp;
import com.aliendroid.sdkads.interfaces.OnLoadBannerMediation;
import com.aliendroid.sdkads.interfaces.OnLoadBannerView;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.props.adsmanager.PropsAdsManagement;


public class AliendroidBanner {
    public static com.facebook.ads.AdView adViewFAN;

    public static OnLoadBannerAdmob onLoadBannerAdmob;
    public static OnLoadBannerGoogle onLoadBannerGoogle;
    public static OnLoadBannerFacebook onLoadBannerFacebook;
    public static OnLoadBannerApplovinDiscovery onLoadBannerApplovinDiscovery;
    public static OnLoadBannerApplovinMax onLoadBannerApplovinMax;
    public static OnLoadBannerStartApp onLoadBannerStartApp;
    public static OnLoadBannerIronSource onLoadBannerIronSource;
    public static OnLoadBannerAlienView onLoadBannerAlienView;
    public static OnLoadBannerAlienMediation onLoadBannerAlienMediation;

    public static void SmallBannerAdmob(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void SmallBannerGoogleAds(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerFAN(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
        adViewFAN = new com.facebook.ads.AdView(activity, idBanner,
                com.facebook.ads.AdSize.BANNER_HEIGHT_50);
        layAds.addView(adViewFAN);
        com.facebook.ads.AdListener adListener = new com.facebook.ads.AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                if (onLoadBannerFacebook!=null){
                    onLoadBannerFacebook.onError();
                }
                if (selectAdsBackup.equals("ALIEN-M")){
                    PropsAdsManagement propsAds = new PropsAdsManagement(activity);
                    AdView adView = propsAds.createBannerAdview("BANNER", idBannerBackup);
                    AdRequest adRequest2 = new AdRequest.Builder().build();
                    layAds.addView(adView);
                    adView.loadAd(adRequest2);
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {
                if (onLoadBannerFacebook!=null){
                    onLoadBannerFacebook.onAdLoaded();
                }
            }

            @Override
            public void onAdClicked(Ad ad) {
                if (onLoadBannerFacebook!=null){
                    onLoadBannerFacebook.onAdClicked();
                }
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                if (onLoadBannerFacebook!=null){
                    onLoadBannerFacebook.onLoggingImpression();
                }
            }
        };
        adViewFAN.loadAd(adViewFAN.buildLoadAdConfig().withAdListener(adListener).build());

    }

    public static void SmallBannerApplovinDisHPK(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String HPK1,
                                                 String HPK2, String HPK3, String HPK4, String HPK5) {
    }

    public static void SmallBannerApplovinDis(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerApplovinMax(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerMopub(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerStartApp(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void SmallBannerIron(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void SmallBannerUnity(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerAlienView(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void SmallBannerAlienMediation(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
        PropsAdsManagement propsAds = new PropsAdsManagement(activity);
        AdView adView = propsAds.createBannerAdview("BANNER", idBanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        layAds.addView(adView);
        adView.loadAd(adRequest);
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                if (selectAdsBackup.equals("FACEBOOK")){
                    adViewFAN = new com.facebook.ads.AdView(activity, idBannerBackup,
                            com.facebook.ads.AdSize.BANNER_HEIGHT_50);
                    layAds.addView(adViewFAN);
                    adViewFAN.loadAd(adViewFAN.buildLoadAdConfig().build());
                }
                super.onAdFailedToLoad(loadAdError);
            }
        });
    }


}
