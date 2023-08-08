package kotlin.coroutines;

import com.urbanairship.iam.C9168d0;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11665v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001$B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0000H\u0002R\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!¨\u0006%"}, mo22516d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Lkotlin/coroutines/CoroutineContext$a;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "b", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "R", "initial", "Lkotlin/Function2;", "operation", "l", "(Ljava/lang/Object;Lkotlin/jvm/functions/p;)Ljava/lang/Object;", "f", "other", "", "equals", "", "hashCode", "", "toString", "h", "element", "e", "context", "g", "left", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$a;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)V", "Serialized", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class CombinedContext implements CoroutineContext, Serializable {
    @C12579k
    private final CoroutineContext.C11040a element;
    @C12579k
    private final CoroutineContext left;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\tB\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo22516d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "Lkotlin/coroutines/CoroutineContext;", "elements", "[Lkotlin/coroutines/CoroutineContext;", "a", "()[Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12990#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    public static final class Serialized implements Serializable {
        @C12579k

        /* renamed from: a */
        public static final C11039a f28240a = new C11039a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;
        @C12579k
        private final CoroutineContext[] elements;

        /* renamed from: kotlin.coroutines.CombinedContext$Serialized$a */
        public static final class C11039a {
            public /* synthetic */ C11039a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C11039a() {
            }
        }

        public Serialized(@C12579k CoroutineContext[] coroutineContextArr) {
            Intrinsics.checkNotNullParameter(coroutineContextArr, "elements");
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.f28243a;
            for (CoroutineContext Q : coroutineContextArr) {
                coroutineContext = coroutineContext.mo7443Q(Q);
            }
            return coroutineContext;
        }

        @C12579k
        /* renamed from: a */
        public final CoroutineContext[] mo22480a() {
            return this.elements;
        }
    }

    public CombinedContext(@C12579k CoroutineContext coroutineContext, @C12579k CoroutineContext.C11040a aVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9168d0.f24880E0);
        Intrinsics.checkNotNullParameter(aVar, "element");
        this.left = coroutineContext;
        this.element = aVar;
    }

    private final Object writeReplace() {
        boolean z;
        int h = mo22477h();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[h];
        Ref.IntRef intRef = new Ref.IntRef();
        mo7446l(C11079d2.f28267a, new CombinedContext$writeReplace$1(coroutineContextArr, intRef));
        if (intRef.element == h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m42559a(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E b = combinedContext.element.mo7444b(bVar);
            if (b != null) {
                return b;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.mo7444b(bVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    /* renamed from: e */
    public final boolean mo22474e(CoroutineContext.C11040a aVar) {
        return Intrinsics.areEqual((Object) mo7444b(aVar.getKey()), (Object) aVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.mo22477h() != mo22477h() || !combinedContext.mo22476g(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        if (this.element.mo7444b(bVar) != null) {
            return this.left;
        }
        CoroutineContext f = this.left.mo7445f(bVar);
        if (f == this.left) {
            return this;
        }
        if (f == EmptyCoroutineContext.f28243a) {
            return this.element;
        }
        return new CombinedContext(f, this.element);
    }

    /* renamed from: g */
    public final boolean mo22476g(CombinedContext combinedContext) {
        while (mo22474e(combinedContext.element)) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return mo22474e((CoroutineContext.C11040a) coroutineContext);
            }
        }
        return false;
    }

    /* renamed from: h */
    public final int mo22477h() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return pVar.invoke(this.left.mo7446l(r, pVar), this.element);
    }

    @C12579k
    public String toString() {
        return C12361b.f30260k + ((String) mo7446l("", CombinedContext$toString$1.f28241f)) + C12361b.f30261l;
    }
}
