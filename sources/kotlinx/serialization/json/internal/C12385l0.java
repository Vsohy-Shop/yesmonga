package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.l0 */
public final class C12385l0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: kotlinx.serialization.json.internal.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: kotlinx.serialization.json.internal.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m50091a(@org.jetbrains.annotations.C12579k kotlinx.serialization.json.C12341a r8, @org.jetbrains.annotations.C12579k kotlinx.serialization.json.C12403k r9, @org.jetbrains.annotations.C12579k kotlinx.serialization.C12199c<T> r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L_0x0023
            kotlinx.serialization.json.internal.JsonTreeDecoder r0 = new kotlinx.serialization.json.internal.JsonTreeDecoder
            r3 = r9
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0044
        L_0x0023:
            boolean r0 = r9 instanceof kotlinx.serialization.json.C12344b
            if (r0 == 0) goto L_0x002f
            kotlinx.serialization.json.internal.x r0 = new kotlinx.serialization.json.internal.x
            kotlinx.serialization.json.b r9 = (kotlinx.serialization.json.C12344b) r9
            r0.<init>(r8, r9)
            goto L_0x0044
        L_0x002f:
            boolean r0 = r9 instanceof kotlinx.serialization.json.C12413r
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x003b
        L_0x0035:
            kotlinx.serialization.json.JsonNull r0 = kotlinx.serialization.json.JsonNull.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)
        L_0x003b:
            if (r0 == 0) goto L_0x0049
            kotlinx.serialization.json.internal.s r0 = new kotlinx.serialization.json.internal.s
            kotlinx.serialization.json.x r9 = (kotlinx.serialization.json.C12421x) r9
            r0.<init>(r8, r9)
        L_0x0044:
            java.lang.Object r8 = r0.mo24870G(r10)
            return r8
        L_0x0049:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C12385l0.m50091a(kotlinx.serialization.json.a, kotlinx.serialization.json.k, kotlinx.serialization.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final <T> T m50092b(@C12579k C12341a aVar, @C12579k String str, @C12579k JsonObject jsonObject, @C12579k C12199c<T> cVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "discriminator");
        Intrinsics.checkNotNullParameter(jsonObject, "element");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return new JsonTreeDecoder(aVar, jsonObject, str, cVar.getDescriptor()).mo24870G(cVar);
    }
}
