package com.google.firebase.perf.util;

import androidx.annotation.C0359n0;

public class Constants {

    /* renamed from: a */
    public static final String f81280a = "FirebasePerfSharedPrefs";

    /* renamed from: b */
    public static final String f81281b = "isEnabled";

    /* renamed from: c */
    public static final float f81282c = 0.0f;

    /* renamed from: d */
    public static final float f81283d = 1.0f;

    /* renamed from: e */
    public static final int f81284e = 2000;

    /* renamed from: f */
    public static final int f81285f = 255;

    /* renamed from: g */
    public static final int f81286g = 128;

    /* renamed from: h */
    public static final int f81287h = 5;

    /* renamed from: i */
    public static final int f81288i = 100;

    /* renamed from: j */
    public static final int f81289j = 100;

    /* renamed from: k */
    public static final int f81290k = 40;

    /* renamed from: l */
    public static final int f81291l = 100;

    /* renamed from: m */
    public static final int f81292m = 1;

    /* renamed from: n */
    public static final int f81293n = 100;

    /* renamed from: o */
    public static final int f81294o = 500;

    /* renamed from: p */
    public static final String f81295p = "_st_";

    /* renamed from: q */
    public static final String f81296q = "Parent_fragment";

    /* renamed from: r */
    public static final String f81297r = "Hosting_activity";

    /* renamed from: s */
    public static final String f81298s = "No parent";

    /* renamed from: t */
    public static final int f81299t = 16;

    /* renamed from: u */
    public static final int f81300u = 700;

    public enum CounterNames {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");
        
        private String mName;

        /* access modifiers changed from: public */
        CounterNames(@C0359n0 String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    public enum TraceNames {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");
        
        private String mName;

        /* access modifiers changed from: public */
        TraceNames(@C0359n0 String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }
}
