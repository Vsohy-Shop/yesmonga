package com.carrefour.fid.android.shared.base;

import android.util.Log;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.preference.C19965r;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.base.C28505u.C28507b;
import com.carrefour.fid.android.shared.base.C28505u.C28509d;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11945o;
import kotlinx.coroutines.flow.C11948r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jetbrains.annotations.C12583o;

@C8567o(parameters = 0)
public abstract class BaseMVIViewModel<S extends C28505u.C28509d, I extends C28505u.C28507b> extends C19476v0 implements C28505u.C28511e<S, I> {
    public static final int $stable = 8;
    @C12579k
    private S _currentState;
    /* access modifiers changed from: private */
    @C12579k
    public final C11911i<C28505u.C28506a> _uiEvent;
    @C12579k
    private final C11911i<S> _uiState;
    /* access modifiers changed from: private */
    @C12579k
    public final S firstModel;
    @C12579k
    private final C12074o0 mviScope;
    @C12580l
    private final C19456p0 savedState;
    @C12579k
    private final C11944n<C28505u.C28506a> uiEvent;
    @C12579k
    private final C11944n<S> uiState;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseMVIViewModel(C28505u.C28509d dVar, CoroutineDispatcher coroutineDispatcher, C19456p0 p0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i & 2) != 0 ? C11768d1.m46783e().mo23706a0() : coroutineDispatcher, (i & 4) != 0 ? null : p0Var);
    }

    @C12579k
    public final <E> LiveData<E> asViewModelScopeLiveData(@C12579k C11907e<? extends E> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return FlowLiveDataConversions.m90506f(eVar, C19500w0.m90846a(this).getCoroutineContext(), 0, 2, (Object) null);
    }

    /* renamed from: c0 */
    public final int mo83332c0(String str) {
        return Log.d(getClass().getSimpleName(), str);
    }

    public final void emitEvent(@C12579k C28505u.C28506a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "event");
        C11723c2 unused = C12038j.m48061f(this.mviScope, (CoroutineContext) null, (CoroutineStart) null, new BaseMVIViewModel$emitEvent$1(this, aVar, (C11045c<? super BaseMVIViewModel$emitEvent$1>) null), 3, (Object) null);
    }

    @C12579k
    public final S getCurrentState() {
        return this._currentState;
    }

    @C12579k
    public final C12074o0 getMviScope() {
        return this.mviScope;
    }

    @C12579k
    public final C11944n<C28505u.C28506a> getUiEvent() {
        return this.uiEvent;
    }

    @C12579k
    public final C11944n<S> getUiState() {
        return this.uiState;
    }

    @C12580l
    public abstract Object processIntent(@C12579k I i, @C12579k C11045c<? super C11079d2> cVar);

    public final void publishState(@C12579k S s) {
        Intrinsics.checkNotNullParameter(s, "state");
        if (this._uiState.mo24198a(s)) {
            this._currentState = s;
        }
    }

    public final <P extends C28505u.C28509d> void reduceAndPublishState(@C12579k C28505u.C28508c<S, P> cVar, @C12579k P p) {
        Intrinsics.checkNotNullParameter(cVar, "reducer");
        Intrinsics.checkNotNullParameter(p, "partial");
        S a = cVar.mo32307a(getCurrentState(), p);
        if (this._uiState.mo24198a(a)) {
            this._currentState = a;
        }
    }

    public final void sendIntent(@C12579k I i) {
        Intrinsics.checkNotNullParameter(i, C19965r.f51092g);
        C11723c2 unused = C12038j.m48061f(this.mviScope, (CoroutineContext) null, (CoroutineStart) null, new BaseMVIViewModel$sendIntent$1(this, i, (C11045c<? super BaseMVIViewModel$sendIntent$1>) null), 3, (Object) null);
    }

    @C12583o
    public final void triggerOnCleared() {
        onCleared();
    }

    public final /* synthetic */ <T extends Enum<T>, E> void updateWithSavedState(C11940j<E> jVar, T t, E e) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(t, "enum");
        updateWithSavedState(jVar, t.name(), e);
    }

    public final <E> void updateWithSavedState(@C12579k C11940j<E> jVar, @C12579k String str, E e) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        C19456p0 p0Var = this.savedState;
        if (p0Var != null) {
            p0Var.mo57656q(str, e);
        }
        jVar.setValue(e);
    }

    public BaseMVIViewModel(@C12579k S s, @C12579k CoroutineDispatcher coroutineDispatcher, @C12580l C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(s, "firstModel");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.firstModel = s;
        C12074o0 m = C12079p0.m48272m(C19500w0.m90846a(this), coroutineDispatcher);
        this.mviScope = m;
        this.savedState = p0Var;
        this._currentState = s;
        C11911i<S> a = C11945o.m47609a(1, 64, BufferOverflow.SUSPEND);
        this._uiState = a;
        this.uiState = C11909g.m47368G1(C11909g.m47448f1(C11909g.m47472m1(a, new BaseMVIViewModel$uiState$1(this, (C11045c<? super BaseMVIViewModel$uiState$1>) null)), new BaseMVIViewModel$uiState$2(this, (C11045c<? super BaseMVIViewModel$uiState$2>) null)), m, C11948r.f29534a.mo24272c(), 1);
        C11911i<C28505u.C28506a> b = C11945o.m47610b(0, 1, (BufferOverflow) null, 5, (Object) null);
        this._uiEvent = b;
        this.uiEvent = C11909g.m47467l(b);
    }
}
