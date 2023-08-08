package com.google.firebase.heartbeatinfo;

import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.firebase.heartbeatinfo.m */
public abstract class C33053m implements Comparable<C33053m> {
    /* renamed from: g */
    public static C33053m m133407g(String str, long j) {
        return new C33041b(str, j);
    }

    /* renamed from: b */
    public int compareTo(C33053m mVar) {
        return mo95742k() < mVar.mo95742k() ? -1 : 1;
    }

    /* renamed from: k */
    public abstract long mo95742k();

    /* renamed from: q */
    public abstract String mo95743q();
}
