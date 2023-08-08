package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.platform.C15902i4;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.saveable.C8624c;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B?\b\u0002\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b8\u00109BK\b\u0016\u0012\u0006\u00105\u001a\u000204\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00028\u00000\"\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b8\u0010;J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 RB\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\"2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(RB\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\"2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(RB\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\"2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u0014\u00103\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u000b¨\u0006<"}, mo22516d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/i4;", "Lkotlin/d2;", "u", "v", "N0", "Landroid/view/View;", "getTypedView", "()Landroid/view/View;", "typedView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "O0", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/runtime/saveable/c;", "P0", "Landroidx/compose/runtime/saveable/c;", "saveStateRegistry", "", "Q0", "Ljava/lang/String;", "saveStateKey", "Landroidx/compose/runtime/saveable/c$a;", "value", "R0", "Landroidx/compose/runtime/saveable/c$a;", "setSaveableRegistryEntry", "(Landroidx/compose/runtime/saveable/c$a;)V", "saveableRegistryEntry", "Lkotlin/Function1;", "S0", "Lkotlin/jvm/functions/l;", "getUpdateBlock", "()Lkotlin/jvm/functions/l;", "setUpdateBlock", "(Lkotlin/jvm/functions/l;)V", "updateBlock", "T0", "getResetBlock", "setResetBlock", "resetBlock", "U0", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "viewRoot", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/q;", "parentContext", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/q;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/saveable/c;Ljava/lang/String;)V", "factory", "(Landroid/content/Context;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/q;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/saveable/c;Ljava/lang/String;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements C15902i4 {
    @C12579k

    /* renamed from: N0 */
    public final T f40962N0;
    @C12579k

    /* renamed from: O0 */
    public final NestedScrollDispatcher f40963O0;
    @C12580l

    /* renamed from: P0 */
    public final C8624c f40964P0;
    @C12579k

    /* renamed from: Q0 */
    public final String f40965Q0;
    @C12580l

    /* renamed from: R0 */
    public C8624c.C8625a f40966R0;
    @C12579k

    /* renamed from: S0 */
    public C11300l<? super T, C11079d2> f40967S0;
    @C12579k

    /* renamed from: T0 */
    public C11300l<? super T, C11079d2> f40968T0;
    @C12579k

    /* renamed from: U0 */
    public C11300l<? super T, C11079d2> f40969U0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewFactoryHolder(Context context, C8602q qVar, View view, NestedScrollDispatcher nestedScrollDispatcher, C8624c cVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : qVar, view, nestedScrollDispatcher, cVar, str);
    }

    private final void setSaveableRegistryEntry(C8624c.C8625a aVar) {
        C8624c.C8625a aVar2 = this.f40966R0;
        if (aVar2 != null) {
            aVar2.mo16409a();
        }
        this.f40966R0 = aVar;
    }

    @C12579k
    public final NestedScrollDispatcher getDispatcher() {
        return this.f40963O0;
    }

    @C12579k
    public final C11300l<T, C11079d2> getReleaseBlock() {
        return this.f40969U0;
    }

    @C12579k
    public final C11300l<T, C11079d2> getResetBlock() {
        return this.f40968T0;
    }

    @C12579k
    public final T getTypedView() {
        return this.f40962N0;
    }

    @C12579k
    public final C11300l<T, C11079d2> getUpdateBlock() {
        return this.f40967S0;
    }

    @C12579k
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "value");
        this.f40969U0 = lVar;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "value");
        this.f40968T0 = lVar;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "value");
        this.f40967S0 = lVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    /* renamed from: u */
    public final void mo47995u() {
        C8624c cVar = this.f40964P0;
        if (cVar != null) {
            setSaveableRegistryEntry(cVar.mo8709b(this.f40965Q0, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
    }

    /* renamed from: v */
    public final void mo47996v() {
        setSaveableRegistryEntry((C8624c.C8625a) null);
    }

    public ViewFactoryHolder(Context context, C8602q qVar, T t, NestedScrollDispatcher nestedScrollDispatcher, C8624c cVar, String str) {
        super(context, qVar, nestedScrollDispatcher);
        this.f40962N0 = t;
        this.f40963O0 = nestedScrollDispatcher;
        this.f40964P0 = cVar;
        this.f40965Q0 = str;
        setClipChildren(false);
        setView$ui_release(t);
        SparseArray sparseArray = null;
        Object f = cVar != null ? cVar.mo8713f(str) : null;
        sparseArray = f instanceof SparseArray ? (SparseArray) f : sparseArray;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        mo47995u();
        this.f40967S0 = AndroidView_androidKt.m74833e();
        this.f40968T0 = AndroidView_androidKt.m74833e();
        this.f40969U0 = AndroidView_androidKt.m74833e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewFactoryHolder(Context context, C11300l lVar, C8602q qVar, NestedScrollDispatcher nestedScrollDispatcher, C8624c cVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, lVar, (i & 4) != 0 ? null : qVar, nestedScrollDispatcher, cVar, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@C12579k Context context, @C12579k C11300l<? super Context, ? extends T> lVar, @C12580l C8602q qVar, @C12579k NestedScrollDispatcher nestedScrollDispatcher, @C12580l C8624c cVar, @C12579k String str) {
        this(context, qVar, (View) lVar.invoke(context), nestedScrollDispatcher, cVar, str);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(lVar, "factory");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(str, "saveStateKey");
    }
}
