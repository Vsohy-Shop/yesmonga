package androidx.lifecycle;

import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C11677z;
import kotlin.jvm.C11283a;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ViewModelLazy<VM extends C19476v0> implements C11677z<VM> {
    @C12579k

    /* renamed from: a */
    public final C11494d<VM> f49747a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C19392a1> f49748b;
    @C12579k

    /* renamed from: c */
    public final C11289a<C19502x0.C19506b> f49749c;
    @C12579k

    /* renamed from: d */
    public final C11289a<C19477a> f49750d;
    @C12580l

    /* renamed from: e */
    public VM f49751e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ViewModelLazy(@C12579k C11494d<VM> dVar, @C12579k C11289a<? extends C19392a1> aVar, @C12579k C11289a<? extends C19502x0.C19506b> aVar2) {
        this(dVar, aVar, aVar2, (C11289a) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(dVar, "viewModelClass");
        Intrinsics.checkNotNullParameter(aVar, "storeProducer");
        Intrinsics.checkNotNullParameter(aVar2, "factoryProducer");
    }

    @C12579k
    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f49751e;
        if (vm != null) {
            return vm;
        }
        VM a = new C19502x0(this.f49748b.invoke(), this.f49749c.invoke(), this.f49750d.invoke()).mo57693a(C11283a.m43409e(this.f49747a));
        this.f49751e = a;
        return a;
    }

    public boolean isInitialized() {
        return this.f49751e != null;
    }

    @C11315i
    public ViewModelLazy(@C12579k C11494d<VM> dVar, @C12579k C11289a<? extends C19392a1> aVar, @C12579k C11289a<? extends C19502x0.C19506b> aVar2, @C12579k C11289a<? extends C19477a> aVar3) {
        Intrinsics.checkNotNullParameter(dVar, "viewModelClass");
        Intrinsics.checkNotNullParameter(aVar, "storeProducer");
        Intrinsics.checkNotNullParameter(aVar2, "factoryProducer");
        Intrinsics.checkNotNullParameter(aVar3, "extrasProducer");
        this.f49747a = dVar;
        this.f49748b = aVar;
        this.f49749c = aVar2;
        this.f49750d = aVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelLazy(C11494d dVar, C11289a aVar, C11289a aVar2, C11289a aVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, aVar, aVar2, (i & 8) != 0 ? C193851.f49752f : aVar3);
    }
}
