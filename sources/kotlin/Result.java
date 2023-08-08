package kotlin;

import java.io.Serializable;
import kotlin.internal.C11110f;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11288f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11288f
@C11665v0(version = "1.3")
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0016\b\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0005J\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u0001\u0014\u0001\u0004\u0018\u00010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo22516d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "h", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "Ljava/lang/Object;", "getValue$annotations", "()V", "j", "(Ljava/lang/Object;)Z", "isSuccess", "i", "isFailure", "b", "a", "Failure", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class Result<T> implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C10852a f28060a = new C10852a((DefaultConstructorMarker) null);
    @C12580l
    private final Object value;

    @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo22516d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Failure implements Serializable {
        @C12579k
        @C11287e
        public final Throwable exception;

        public Failure(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            this.exception = th;
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof Failure) && Intrinsics.areEqual((Object) this.exception, (Object) ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @C12579k
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* renamed from: kotlin.Result$a */
    public static final class C10852a {
        public /* synthetic */ C10852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11110f
        @C11314h(name = "failure")
        /* renamed from: a */
        public final <T> Object mo21863a(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            return Result.m38702b(C11661u0.m45734a(th));
        }

        @C11110f
        @C11314h(name = "success")
        /* renamed from: b */
        public final <T> Object mo21864b(T t) {
            return Result.m38702b(t);
        }

        public C10852a() {
        }
    }

    @C11532s0
    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ Result m38701a(Object obj) {
        return new Result(obj);
    }

    @C12579k
    @C11532s0
    /* renamed from: b */
    public static <T> Object m38702b(@C12580l Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m38703c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).mo21858l());
    }

    /* renamed from: d */
    public static final boolean m38704d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @C12580l
    /* renamed from: e */
    public static final Throwable m38705e(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    @C11110f
    /* renamed from: f */
    public static final T m38706f(Object obj) {
        if (m38709i(obj)) {
            return null;
        }
        return obj;
    }

    @C11532s0
    /* renamed from: g */
    public static /* synthetic */ void m38707g() {
    }

    /* renamed from: h */
    public static int m38708h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public static final boolean m38709i(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: j */
    public static final boolean m38710j(Object obj) {
        return !(obj instanceof Failure);
    }

    @C12579k
    /* renamed from: k */
    public static String m38711k(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m38703c(this.value, obj);
    }

    public int hashCode() {
        return m38708h(this.value);
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo21858l() {
        return this.value;
    }

    @C12579k
    public String toString() {
        return m38711k(this.value);
    }
}
