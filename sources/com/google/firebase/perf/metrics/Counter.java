package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C33369a();

    /* renamed from: a */
    public final String f81082a;

    /* renamed from: b */
    public final AtomicLong f81083b;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    public class C33369a implements Parcelable.Creator<Counter> {
        /* renamed from: a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, (C33369a) null);
        }

        /* renamed from: b */
        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    public /* synthetic */ Counter(Parcel parcel, C33369a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public long mo96472a() {
        return this.f81083b.get();
    }

    @C0359n0
    /* renamed from: b */
    public String mo96473b() {
        return this.f81082a;
    }

    /* renamed from: c */
    public void mo96474c(long j) {
        this.f81083b.addAndGet(j);
    }

    /* renamed from: d */
    public void mo96475d(long j) {
        this.f81083b.set(j);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f81082a);
        parcel.writeLong(this.f81083b.get());
    }

    public Counter(@C0359n0 String str) {
        this.f81082a = str;
        this.f81083b = new AtomicLong(0);
    }

    public Counter(Parcel parcel) {
        this.f81082a = parcel.readString();
        this.f81083b = new AtomicLong(parcel.readLong());
    }
}
