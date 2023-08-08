package kotlin.p010io.path;

import org.jetbrains.annotations.C12579k;

@C11241r
/* renamed from: kotlin.io.path.e */
public final class C11188e implements C11168a {
    @C12579k

    /* renamed from: a */
    public static final C11188e f28383a = new C11188e();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
        if (java.nio.file.Files.isDirectory(r6, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L_0x003a;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.p010io.path.CopyActionResult mo22653a(@org.jetbrains.annotations.C12579k java.nio.file.Path r5, @org.jetbrains.annotations.C12579k java.nio.file.Path r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.io.path.x r0 = kotlin.p010io.path.C11265x.f28403a
            java.nio.file.LinkOption[] r7 = r0.mo22683a(r7)
            int r0 = r7.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r5, r0)
            if (r0 == 0) goto L_0x003a
            r0 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            r2 = 0
            java.nio.file.LinkOption r3 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r6, r0)
            if (r0 != 0) goto L_0x0051
        L_0x003a:
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            java.nio.file.Path r5 = java.nio.file.Files.copy(r5, r6, r7)
            java.lang.String r6 = "copy(this, target, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
        L_0x0051:
            kotlin.io.path.CopyActionResult r5 = kotlin.p010io.path.CopyActionResult.CONTINUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11188e.mo22653a(java.nio.file.Path, java.nio.file.Path, boolean):kotlin.io.path.CopyActionResult");
    }
}
