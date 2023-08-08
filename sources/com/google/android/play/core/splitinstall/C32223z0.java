package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.tasks.C32227d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.z0 */
public final class C32223z0 implements C32158c {

    /* renamed from: a */
    public final C32162d0 f78565a;

    /* renamed from: b */
    public final C32217w0 f78566b;

    /* renamed from: c */
    public final C32199t0 f78567c;

    /* renamed from: d */
    public final C32166e0 f78568d;

    /* renamed from: e */
    public final Handler f78569e = new Handler(Looper.getMainLooper());

    public C32223z0(C32162d0 d0Var, C32217w0 w0Var, C32199t0 t0Var, C32166e0 e0Var) {
        this.f78565a = d0Var;
        this.f78566b = w0Var;
        this.f78567c = t0Var;
        this.f78568d = e0Var;
    }

    /* renamed from: s */
    public static List<String> m130326s(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale languageTag : list) {
            arrayList.add(languageTag.toLanguageTag());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo92921a(C32167f fVar, Activity activity, int i) throws IntentSender.SendIntentException {
        return mo92926f(fVar, new C32221y0(activity), i);
    }

    /* renamed from: b */
    public final C32227d<Void> mo92922b(List<Locale> list) {
        return this.f78565a.mo92941d(m130326s(list));
    }

    /* renamed from: c */
    public final C32227d<Void> mo92923c(int i) {
        return this.f78565a.mo92945h(i);
    }

    /* renamed from: d */
    public final C32227d<List<C32167f>> mo92924d() {
        return this.f78565a.mo92944g();
    }

    /* renamed from: e */
    public final C32227d<Void> mo92925e(List<Locale> list) {
        return this.f78565a.mo92942e(m130326s(list));
    }

    /* renamed from: f */
    public final boolean mo92926f(C32167f fVar, C32014a aVar, int i) throws IntentSender.SendIntentException {
        if (fVar.mo92965m() != 8 || fVar.mo92963k() == null) {
            return false;
        }
        aVar.mo92415a(fVar.mo92963k().getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r1.containsAll(r2) != false) goto L_0x0038;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.C32227d<java.lang.Integer> mo92927g(com.google.android.play.core.splitinstall.C32164e r5) {
        /*
            r4 = this;
            java.util.List r0 = r5.mo92946a()
            boolean r0 = r0.isEmpty()
            java.util.List r0 = r5.mo92946a()
            com.google.android.play.core.splitinstall.t0 r1 = r4.f78567c
            java.util.Set r1 = r1.mo92984b()
            if (r1 != 0) goto L_0x0015
            goto L_0x0038
        L_0x0015:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r0.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r3 = r3.getLanguage()
            r2.add(r3)
            goto L_0x001e
        L_0x0032:
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x006a
        L_0x0038:
            java.util.List r0 = r5.mo92947b()
            java.util.Set r1 = r4.mo92932l()
            boolean r0 = r1.containsAll(r0)
            if (r0 == 0) goto L_0x006a
            java.util.List r0 = r5.mo92947b()
            com.google.android.play.core.splitinstall.e0 r1 = r4.f78568d
            java.util.Set r1 = r1.mo92952a()
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 == 0) goto L_0x006a
            android.os.Handler r0 = r4.f78569e
            com.google.android.play.core.splitinstall.x0 r1 = new com.google.android.play.core.splitinstall.x0
            r1.<init>(r4, r5)
            r0.post(r1)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.android.play.core.tasks.d r5 = com.google.android.play.core.tasks.C32229f.m130358a(r5)
            return r5
        L_0x006a:
            com.google.android.play.core.splitinstall.d0 r0 = r4.f78565a
            java.util.List r1 = r5.mo92947b()
            java.util.List r5 = r5.mo92946a()
            java.util.List r5 = m130326s(r5)
            com.google.android.play.core.tasks.d r5 = r0.mo92938a(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C32223z0.mo92927g(com.google.android.play.core.splitinstall.e):com.google.android.play.core.tasks.d");
    }

    /* renamed from: h */
    public final synchronized void mo92928h(C32169g gVar) {
        this.f78566b.mo93009k(gVar);
    }

    /* renamed from: i */
    public final C32227d<Void> mo92929i(List<String> list) {
        this.f78568d.mo92953b(list);
        return this.f78565a.mo92939b(list);
    }

    /* renamed from: j */
    public final C32227d<C32167f> mo92930j(int i) {
        return this.f78565a.mo92943f(i);
    }

    /* renamed from: k */
    public final synchronized void mo92931k(C32169g gVar) {
        this.f78566b.mo93008j(gVar);
    }

    /* renamed from: l */
    public final Set<String> mo92932l() {
        return this.f78567c.mo92983a();
    }

    /* renamed from: m */
    public final C32227d<Void> mo92933m(List<String> list) {
        return this.f78565a.mo92940c(list);
    }

    /* renamed from: n */
    public final synchronized void mo92934n(C32169g gVar) {
        this.f78566b.mo92851e(gVar);
    }

    /* renamed from: o */
    public final synchronized void mo92935o(C32169g gVar) {
        this.f78566b.mo92850d(gVar);
    }

    /* renamed from: p */
    public final Set<String> mo92936p() {
        Set<String> b = this.f78567c.mo92984b();
        return b == null ? Collections.emptySet() : b;
    }
}
