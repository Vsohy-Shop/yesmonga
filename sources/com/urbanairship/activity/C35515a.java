package com.urbanairship.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.app.C0478f;
import androidx.appcompat.app.C0481i;

/* renamed from: com.urbanairship.activity.a */
public class C35515a {

    /* renamed from: a */
    public C0481i f87580a;

    @C0359n0
    /* renamed from: b */
    public static C35515a m146505b(@C0359n0 Activity activity) {
        C35515a aVar = new C35515a();
        aVar.f87580a = C0481i.m2241n(activity, (C0478f) null);
        return aVar;
    }

    /* renamed from: a */
    public void mo106394a(View view, ViewGroup.LayoutParams layoutParams) {
        this.f87580a.mo1121f(view, layoutParams);
    }

    /* renamed from: c */
    public MenuInflater mo106395c() {
        return this.f87580a.mo1171z();
    }

    @C0363p0
    /* renamed from: d */
    public C0441a mo106396d() {
        return this.f87580a.mo1073C();
    }

    /* renamed from: e */
    public void mo106397e() {
        this.f87580a.mo1079F();
    }

    /* renamed from: f */
    public void mo106398f(Configuration configuration) {
        this.f87580a.mo1086L(configuration);
    }

    /* renamed from: g */
    public void mo106399g(Bundle bundle) {
        C0481i iVar = this.f87580a;
        if (iVar != null) {
            iVar.mo1077E();
            this.f87580a.mo1088M(bundle);
        }
    }

    /* renamed from: h */
    public void mo106400h() {
        this.f87580a.mo1090N();
    }

    /* renamed from: i */
    public void mo106401i(Bundle bundle) {
        this.f87580a.mo1092O(bundle);
    }

    /* renamed from: j */
    public void mo106402j() {
        this.f87580a.mo1094P();
    }

    /* renamed from: k */
    public void mo106403k() {
        this.f87580a.mo1100S();
    }

    /* renamed from: l */
    public void mo106404l(int i) {
        this.f87580a.mo1109Z(i);
    }

    /* renamed from: m */
    public void mo106405m(View view) {
        this.f87580a.mo1112a0(view);
    }

    /* renamed from: n */
    public void mo106406n(View view, ViewGroup.LayoutParams layoutParams) {
        this.f87580a.mo1115b0(view, layoutParams);
    }

    /* renamed from: o */
    public void mo106407o(CharSequence charSequence) {
        this.f87580a.mo1132j0(charSequence);
    }
}
