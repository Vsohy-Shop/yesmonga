package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.core.e */
public final class C20995e<T> extends SpecificationComputer<T> {
    @C12579k

    /* renamed from: b */
    public final T f54160b;
    @C12579k

    /* renamed from: c */
    public final String f54161c;
    @C12579k

    /* renamed from: d */
    public final String f54162d;
    @C12579k

    /* renamed from: e */
    public final C20997f f54163e;
    @C12579k

    /* renamed from: f */
    public final SpecificationComputer.VerificationMode f54164f;
    @C12579k

    /* renamed from: g */
    public final WindowStrictModeException f54165g;

    /* renamed from: androidx.window.core.e$a */
    public /* synthetic */ class C20996a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C20995e(@C12579k T t, @C12579k String str, @C12579k String str2, @C12579k C20997f fVar, @C12579k SpecificationComputer.VerificationMode verificationMode) {
        Intrinsics.checkNotNullParameter(t, "value");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(fVar, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f54160b = t;
        this.f54161c = str;
        this.f54162d = str2;
        this.f54163e = fVar;
        this.f54164f = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(mo62744b(t, str2));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        Object[] array = ArraysKt___ArraysKt.m39165M9(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.f54165g = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @C12580l
    /* renamed from: a */
    public T mo62743a() {
        int i = C20996a.$EnumSwitchMapping$0[this.f54164f.ordinal()];
        if (i == 1) {
            throw this.f54165g;
        } else if (i == 2) {
            this.f54163e.mo62763a(this.f54161c, mo62744b(this.f54160b, this.f54162d));
            return null;
        } else if (i == 3) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: c */
    public SpecificationComputer<T> mo62745c(@C12579k String str, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(lVar, "condition");
        return this;
    }

    @C12579k
    /* renamed from: d */
    public final WindowStrictModeException mo62777d() {
        return this.f54165g;
    }

    @C12579k
    /* renamed from: e */
    public final C20997f mo62778e() {
        return this.f54163e;
    }

    @C12579k
    /* renamed from: f */
    public final String mo62779f() {
        return this.f54162d;
    }

    @C12579k
    /* renamed from: g */
    public final String mo62780g() {
        return this.f54161c;
    }

    @C12579k
    /* renamed from: h */
    public final T mo62781h() {
        return this.f54160b;
    }

    @C12579k
    /* renamed from: i */
    public final SpecificationComputer.VerificationMode mo62782i() {
        return this.f54164f;
    }
}
