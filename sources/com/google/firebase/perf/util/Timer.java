package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.util.C40974d0;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C33430a();

    /* renamed from: a */
    public long f81321a;

    /* renamed from: b */
    public long f81322b;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    public class C33430a implements Parcelable.Creator<Timer> {
        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C33430a) null);
        }

        /* renamed from: b */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    public /* synthetic */ Timer(Parcel parcel, C33430a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static long m134804a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: f */
    public static Timer m134805f(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(m134806h() + (micros - m134804a()), micros);
    }

    /* renamed from: h */
    public static long m134806h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    /* renamed from: b */
    public long mo96890b() {
        return this.f81321a + mo96891c();
    }

    /* renamed from: c */
    public long mo96891c() {
        return mo96892d(new Timer());
    }

    /* renamed from: d */
    public long mo96892d(@C0359n0 Timer timer) {
        return timer.f81322b - this.f81322b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo96894e() {
        return this.f81321a;
    }

    /* renamed from: g */
    public void mo96895g() {
        this.f81321a = m134806h();
        this.f81322b = m134804a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f81321a);
        parcel.writeLong(this.f81322b);
    }

    public Timer() {
        this(m134806h(), m134804a());
    }

    @C40974d0
    public Timer(long j, long j2) {
        this.f81321a = j;
        this.f81322b = j2;
    }

    @C40974d0
    public Timer(long j) {
        this(j, j);
    }

    public Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
