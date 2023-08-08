package kotlinx.serialization;

import kotlin.C11076d0;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u001b\b\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, mo22516d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "fieldName", "", "(Ljava/lang/String;)V", "fieldNames", "", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "message", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "kotlinx-serialization-core"}, mo22517k = 1, mo22518mv = {1, 6, 0}, mo22520xi = 48)
@C11532s0
public final class MissingFieldException extends SerializationException {
    public MissingFieldException(@C12580l String str, @C12580l Throwable th) {
        super(str, th);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@C12579k String str) {
        this("Field '" + str + "' is required, but it was missing", (Throwable) null);
        Intrinsics.checkNotNullParameter(str, "fieldName");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MissingFieldException(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r3, @org.jetbrains.annotations.C12579k java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fieldNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "serialName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field '"
            r0.append(r1)
            r1 = 0
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = "' is required for type with serial name '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "', but it was missing"
            goto L_0x0047
        L_0x0030:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " are required for type with serial name '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "', but they were missing"
        L_0x0047:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2.<init>((java.lang.String) r3, (java.lang.Throwable) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.MissingFieldException.<init>(java.util.List, java.lang.String):void");
    }
}
