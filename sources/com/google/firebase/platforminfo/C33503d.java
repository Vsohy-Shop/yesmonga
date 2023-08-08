package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.d */
public class C33503d {

    /* renamed from: b */
    public static volatile C33503d f81506b;

    /* renamed from: a */
    public final Set<C33505f> f81507a = new HashSet();

    /* renamed from: a */
    public static C33503d m135077a() {
        C33503d dVar = f81506b;
        if (dVar == null) {
            synchronized (C33503d.class) {
                dVar = f81506b;
                if (dVar == null) {
                    dVar = new C33503d();
                    f81506b = dVar;
                }
            }
        }
        return dVar;
    }

    /* renamed from: b */
    public Set<C33505f> mo97261b() {
        Set<C33505f> unmodifiableSet;
        synchronized (this.f81507a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f81507a);
        }
        return unmodifiableSet;
    }

    /* renamed from: c */
    public void mo97262c(String str, String str2) {
        synchronized (this.f81507a) {
            this.f81507a.add(C33505f.m135081a(str, str2));
        }
    }
}
