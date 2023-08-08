package androidx.activity;

import androidx.annotation.C0353k0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:86,2\n*E\n"})
/* renamed from: androidx.activity.t */
public abstract class C0309t {

    /* renamed from: a */
    public boolean f826a;
    @C12579k

    /* renamed from: b */
    public final CopyOnWriteArrayList<C0240h> f827b = new CopyOnWriteArrayList<>();
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f828c;

    public C0309t(boolean z) {
        this.f826a = z;
    }

    @C11314h(name = "addCancellable")
    /* renamed from: d */
    public final void mo965d(@C12579k C0240h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "cancellable");
        this.f827b.add(hVar);
    }

    @C12580l
    /* renamed from: e */
    public final C11289a<C11079d2> mo966e() {
        return this.f828c;
    }

    @C0353k0
    /* renamed from: f */
    public abstract void mo792f();

    @C0353k0
    /* renamed from: g */
    public final boolean mo967g() {
        return this.f826a;
    }

    @C0353k0
    /* renamed from: h */
    public final void mo968h() {
        for (C0240h cancel : this.f827b) {
            cancel.cancel();
        }
    }

    @C11314h(name = "removeCancellable")
    /* renamed from: i */
    public final void mo969i(@C12579k C0240h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "cancellable");
        this.f827b.remove(hVar);
    }

    @C0353k0
    /* renamed from: j */
    public final void mo970j(boolean z) {
        this.f826a = z;
        C11289a<C11079d2> aVar = this.f828c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: k */
    public final void mo971k(@C12580l C11289a<C11079d2> aVar) {
        this.f828c = aVar;
    }
}
