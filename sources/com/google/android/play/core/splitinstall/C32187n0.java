package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import android.support.annotation.NonNull;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.splitinstall.testing.C32200a;
import com.google.android.play.core.tasks.C32227d;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.n0 */
public final class C32187n0 implements C32158c {

    /* renamed from: a */
    public final C32040c1<C32223z0> f78474a;

    /* renamed from: b */
    public final C32040c1<C32200a> f78475b;

    /* renamed from: c */
    public final C32040c1<File> f78476c;

    public C32187n0(C32040c1<C32223z0> c1Var, C32040c1<C32200a> c1Var2, C32040c1<File> c1Var3) {
        this.f78474a = c1Var;
        this.f78475b = c1Var2;
        this.f78476c = c1Var3;
    }

    /* renamed from: a */
    public final boolean mo92921a(@NonNull C32167f fVar, @NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        return mo92982q().mo92921a(fVar, activity, i);
    }

    @NonNull
    /* renamed from: b */
    public final C32227d<Void> mo92922b(List<Locale> list) {
        return mo92982q().mo92922b(list);
    }

    @NonNull
    /* renamed from: c */
    public final C32227d<Void> mo92923c(int i) {
        return mo92982q().mo92923c(i);
    }

    @NonNull
    /* renamed from: d */
    public final C32227d<List<C32167f>> mo92924d() {
        return mo92982q().mo92924d();
    }

    @NonNull
    /* renamed from: e */
    public final C32227d<Void> mo92925e(List<Locale> list) {
        return mo92982q().mo92925e(list);
    }

    /* renamed from: f */
    public final boolean mo92926f(@NonNull C32167f fVar, @NonNull C32014a aVar, int i) throws IntentSender.SendIntentException {
        return mo92982q().mo92926f(fVar, aVar, i);
    }

    /* renamed from: g */
    public final C32227d<Integer> mo92927g(@NonNull C32164e eVar) {
        return mo92982q().mo92927g(eVar);
    }

    /* renamed from: h */
    public final void mo92928h(@NonNull C32169g gVar) {
        mo92982q().mo92928h(gVar);
    }

    @NonNull
    /* renamed from: i */
    public final C32227d<Void> mo92929i(List<String> list) {
        return mo92982q().mo92929i(list);
    }

    @NonNull
    /* renamed from: j */
    public final C32227d<C32167f> mo92930j(int i) {
        return mo92982q().mo92930j(i);
    }

    /* renamed from: k */
    public final void mo92931k(@NonNull C32169g gVar) {
        mo92982q().mo92931k(gVar);
    }

    @NonNull
    /* renamed from: l */
    public final Set<String> mo92932l() {
        return mo92982q().mo92932l();
    }

    @NonNull
    /* renamed from: m */
    public final C32227d<Void> mo92933m(List<String> list) {
        return mo92982q().mo92933m(list);
    }

    /* renamed from: n */
    public final void mo92934n(@NonNull C32169g gVar) {
        mo92982q().mo92934n(gVar);
    }

    /* renamed from: o */
    public final void mo92935o(@NonNull C32169g gVar) {
        mo92982q().mo92935o(gVar);
    }

    @NonNull
    /* renamed from: p */
    public final Set<String> mo92936p() {
        return mo92982q().mo92936p();
    }

    /* renamed from: q */
    public final C32158c mo92982q() {
        return (C32158c) (this.f78476c.mo92734a() == null ? this.f78474a : this.f78475b).mo92734a();
    }
}
