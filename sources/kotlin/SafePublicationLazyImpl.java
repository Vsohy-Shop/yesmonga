package kotlin;

import androidx.concurrent.futures.C16563a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000 \u0016*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0016B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\b@\bX\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo22516d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/z;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "Lkotlin/Function0;", "initializer", "Lkotlin/jvm/functions/a;", "_value", "Ljava/lang/Object;", "final", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/a;)V", "a", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
final class SafePublicationLazyImpl<T> implements C11677z<T>, Serializable {
    @C12579k

    /* renamed from: a */
    public static final C10853a f28061a = new C10853a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f28062b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    @C12580l
    private volatile Object _value;
    @C12579k

    /* renamed from: final  reason: not valid java name */
    private final Object f108003final;
    @C12580l
    private volatile C11289a<? extends T> initializer;

    /* renamed from: kotlin.SafePublicationLazyImpl$a */
    public static final class C10853a {
        public /* synthetic */ C10853a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10853a() {
        }
    }

    public SafePublicationLazyImpl(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "initializer");
        this.initializer = aVar;
        C11673x1 x1Var = C11673x1.f28985a;
        this._value = x1Var;
        this.f108003final = x1Var;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        T t = this._value;
        T t2 = C11673x1.f28985a;
        if (t != t2) {
            return t;
        }
        C11289a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (C16563a.m75000a(f28062b, this, t2, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
    }

    public boolean isInitialized() {
        return this._value != C11673x1.f28985a;
    }

    @C12579k
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
