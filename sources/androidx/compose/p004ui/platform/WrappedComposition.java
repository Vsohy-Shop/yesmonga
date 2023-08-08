package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8776o;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8598p;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\"\u0010\u0007\u001a\u00020\u00042\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R!\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006,"}, mo22516d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/p;", "Landroidx/lifecycle/t;", "Lkotlin/Function0;", "Lkotlin/d2;", "Landroidx/compose/runtime/g;", "content", "j", "(Lkotlin/jvm/functions/p;)V", "g", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "i", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "F", "()Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "Landroidx/compose/runtime/p;", "E", "()Landroidx/compose/runtime/p;", "original", "", "c", "Z", "disposed", "Landroidx/lifecycle/Lifecycle;", "d", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "e", "Lkotlin/jvm/functions/p;", "lastContent", "u", "()Z", "hasInvalidations", "h", "isDisposed", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/p;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WrappedComposition */
final class WrappedComposition implements C8598p, C19470t {
    @C12579k

    /* renamed from: a */
    public final AndroidComposeView f39443a;
    @C12579k

    /* renamed from: b */
    public final C8598p f39444b;

    /* renamed from: c */
    public boolean f39445c;
    @C12580l

    /* renamed from: d */
    public Lifecycle f39446d;
    @C12579k

    /* renamed from: e */
    public C11304p<? super C8592o, ? super Integer, C11079d2> f39447e = ComposableSingletons$Wrapper_androidKt.f39313a.mo45517a();

    public WrappedComposition(@C12579k AndroidComposeView androidComposeView, @C12579k C8598p pVar) {
        Intrinsics.checkNotNullParameter(androidComposeView, "owner");
        Intrinsics.checkNotNullParameter(pVar, "original");
        this.f39443a = androidComposeView;
        this.f39444b = pVar;
    }

    @C12579k
    /* renamed from: E */
    public final C8598p mo45609E() {
        return this.f39444b;
    }

    @C12579k
    /* renamed from: F */
    public final AndroidComposeView mo45610F() {
        return this.f39443a;
    }

    /* renamed from: g */
    public void mo16284g() {
        if (!this.f39445c) {
            this.f39445c = true;
            this.f39443a.getView().setTag(C8776o.C8778b.wrapped_composition_tag, (Object) null);
            Lifecycle lifecycle = this.f39446d;
            if (lifecycle != null) {
                lifecycle.mo57467d(this);
            }
        }
        this.f39444b.mo16284g();
    }

    /* renamed from: h */
    public boolean mo16285h() {
        return this.f39444b.mo16285h();
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_DESTROY) {
            mo16284g();
        } else if (event == Lifecycle.C19372Event.ON_CREATE && !this.f39445c) {
            mo16286j(this.f39447e);
        }
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: j */
    public void mo16286j(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        this.f39443a.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, pVar));
    }

    /* renamed from: u */
    public boolean mo16287u() {
        return this.f39444b.mo16287u();
    }
}
