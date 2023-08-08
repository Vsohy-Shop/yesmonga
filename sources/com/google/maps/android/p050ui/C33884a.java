package com.google.maps.android.p050ui;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.maps.android.ui.a */
public class C33884a {

    /* renamed from: com.google.maps.android.ui.a$a */
    public class C33885a implements Runnable {

        /* renamed from: a */
        public long f82224a;

        /* renamed from: b */
        public float f82225b;

        /* renamed from: c */
        public float f82226c;

        /* renamed from: d */
        public final /* synthetic */ long f82227d;

        /* renamed from: e */
        public final /* synthetic */ Interpolator f82228e;

        /* renamed from: f */
        public final /* synthetic */ C30587h f82229f;

        /* renamed from: g */
        public final /* synthetic */ C33886b f82230g;

        /* renamed from: v */
        public final /* synthetic */ LatLng f82231v;

        /* renamed from: w */
        public final /* synthetic */ LatLng f82232w;

        /* renamed from: x */
        public final /* synthetic */ Handler f82233x;

        public C33885a(long j, Interpolator interpolator, C30587h hVar, C33886b bVar, LatLng latLng, LatLng latLng2, Handler handler) {
            this.f82227d = j;
            this.f82228e = interpolator;
            this.f82229f = hVar;
            this.f82230g = bVar;
            this.f82231v = latLng;
            this.f82232w = latLng2;
            this.f82233x = handler;
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f82227d;
            this.f82224a = uptimeMillis;
            float f = ((float) uptimeMillis) / 2000.0f;
            this.f82225b = f;
            float interpolation = this.f82228e.getInterpolation(f);
            this.f82226c = interpolation;
            this.f82229f.mo86577u(this.f82230g.mo98598a(interpolation, this.f82231v, this.f82232w));
            if (this.f82225b < 1.0f) {
                this.f82233x.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: com.google.maps.android.ui.a$b */
    public interface C33886b {

        /* renamed from: com.google.maps.android.ui.a$b$a */
        public static class C33887a implements C33886b {
            /* renamed from: a */
            public LatLng mo98598a(float f, LatLng latLng, LatLng latLng2) {
                double d = latLng2.f73028a;
                double d2 = latLng.f73028a;
                double d3 = (double) f;
                double d4 = ((d - d2) * d3) + d2;
                double d5 = latLng2.f73029b - latLng.f73029b;
                if (Math.abs(d5) > 180.0d) {
                    d5 -= Math.signum(d5) * 360.0d;
                }
                return new LatLng(d4, (d5 * d3) + latLng.f73029b);
            }
        }

        /* renamed from: a */
        LatLng mo98598a(float f, LatLng latLng, LatLng latLng2);
    }

    /* renamed from: a */
    public static void m136468a(C30587h hVar, LatLng latLng) {
        C33886b.C33887a aVar = new C33886b.C33887a();
        LatLng c = hVar.mo86557c();
        Handler handler = new Handler();
        handler.post(new C33885a(SystemClock.uptimeMillis(), new AccelerateDecelerateInterpolator(), hVar, aVar, c, latLng, handler));
    }
}
