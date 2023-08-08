package kotlin.p010io.path;

import androidx.exifinterface.media.C19135a;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10927c1;
import kotlin.collections.C10930d1;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1132:1\n26#2:1133\n26#2:1137\n1#3:1134\n1855#4,2:1135\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1133\n574#1:1137\n440#1:1135,2\n*E\n"})
/* renamed from: kotlin.io.path.e3 */
public class C11192e3 extends PathsKt__PathRecursiveFunctionsKt {
    @C12579k
    @C11532s0
    /* renamed from: A0 */
    public static final Void m43157A0(@C12579k Path path, @C12579k Class<?> cls) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @C11665v0(version = "1.7")
    @C11241r
    /* renamed from: A1 */
    public static final void m43158A1(@C12579k Path path, @C12579k FileVisitor<Path> fileVisitor, int i, boolean z) {
        Set set;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(fileVisitor, "visitor");
        if (z) {
            set = C10927c1.m40883f(FileVisitOption.FOLLOW_LINKS);
        } else {
            set = C10930d1.m40892k();
        }
        Path unused = Files.walkFileTree(path, set, i, fileVisitor);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: B0 */
    public static final /* synthetic */ <V extends FileAttributeView> V m43159B0(Path path, LinkOption... linkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48877X4);
        FileAttributeView a = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (a != null) {
            return C11212j2.m43260a(a);
        }
        Intrinsics.reifiedOperationMarker(4, C19135a.f48877X4);
        m43157A0(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m43160B1(Path path, int i, boolean z, C11300l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        m43237z1(path, i, z, lVar);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: C0 */
    public static final /* synthetic */ <V extends FileAttributeView> V m43161C0(Path path, LinkOption... linkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48877X4);
        return Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m43162C1(Path path, FileVisitor fileVisitor, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        m43158A1(path, fileVisitor, i, z);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: D0 */
    public static final long m43163D0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.size(path);
    }

    @C11665v0(version = "1.7")
    @C12579k
    @C11241r
    /* renamed from: D1 */
    public static final C11559m<Path> m43164D1(@C12579k Path path, @C12579k PathWalkOption... pathWalkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(pathWalkOptionArr, "options");
        return new PathTreeWalk(path, pathWalkOptionArr);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: E0 */
    public static final FileStore m43165E0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        FileStore a = Files.getFileStore(path);
        Intrinsics.checkNotNullExpressionValue(a, "getFileStore(this)");
        return a;
    }

    @C11665v0(version = "1.7")
    @C12579k
    @C11241r
    /* renamed from: F0 */
    public static final FileVisitor<Path> m43166F0(@C12579k C11300l<? super C11245s, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C11249t tVar = new C11249t();
        lVar.invoke(tVar);
        return tVar.mo22672e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r2, r4);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r0;
     */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.5")
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43167G0(java.nio.file.Path r2, java.lang.String r3, kotlin.jvm.functions.C11300l<? super java.nio.file.Path, kotlin.C11079d2> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r2, r3)
            r3 = 1
            java.nio.file.DirectoryStream r0 = kotlin.p010io.path.C11270y0.m43374a(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            r4.invoke(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0021
        L_0x002f:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4 = 0
            kotlin.p010io.C11133b.m42950a(r2, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return
        L_0x003c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            kotlin.p010io.C11133b.m42950a(r2, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11192e3.m43167G0(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r0, r1);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw r2;
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m43168H0(java.nio.file.Path r0, java.lang.String r1, kotlin.jvm.functions.C11300l r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.lang.String r1 = "*"
        L_0x0006:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            java.nio.file.DirectoryStream r1 = kotlin.p010io.path.C11270y0.m43374a(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch:{ all -> 0x0041 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0026:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0041 }
            r2.invoke(r3)     // Catch:{ all -> 0x0041 }
            goto L_0x0026
        L_0x0034:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0041 }
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r0, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            return
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r2 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            kotlin.p010io.C11133b.m42950a(r0, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11192e3.m43168H0(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.l, int, java.lang.Object):void");
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: I0 */
    public static final Object m43169I0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(str, "attribute");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @C12579k
    /* renamed from: J0 */
    public static final String m43170J0(@C12579k Path path) {
        String obj;
        String substringAfterLast;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path a = path.getFileName();
        if (a == null || (obj = a.toString()) == null || (substringAfterLast = StringsKt__StringsKt.substringAfterLast(obj, '.', "")) == null) {
            return "";
        }
        return substringAfterLast;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11665v0(version = "1.5")
    /* renamed from: K0 */
    public static /* synthetic */ void m43171K0(Path path) {
    }

    /* renamed from: L0 */
    public static final String m43172L0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return m43174N0(path);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @C11587t0(expression = "invariantSeparatorsPathString", imports = {}))
    @C11110f
    @C11665v0(version = "1.4")
    @C11241r
    /* renamed from: M0 */
    public static /* synthetic */ void m43173M0(Path path) {
    }

    @C12579k
    /* renamed from: N0 */
    public static final String m43174N0(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String a = path.getFileSystem().getSeparator();
        if (Intrinsics.areEqual((Object) a, (Object) "/")) {
            return path.toString();
        }
        String obj = path.toString();
        Intrinsics.checkNotNullExpressionValue(a, "separator");
        return C11622t.replace$default(obj, a, "/", false, 4, (Object) null);
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11665v0(version = "1.5")
    /* renamed from: O0 */
    public static /* synthetic */ void m43175O0(Path path) {
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: P0 */
    public static final FileTime m43176P0(Path path, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        FileTime a = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "getLastModifiedTime(this, *options)");
        return a;
    }

    @C12579k
    /* renamed from: Q0 */
    public static final String m43177Q0(@C12579k Path path) {
        String str;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path a = path.getFileName();
        if (a != null) {
            str = a.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11665v0(version = "1.5")
    /* renamed from: R0 */
    public static /* synthetic */ void m43178R0(Path path) {
    }

    @C12579k
    /* renamed from: S0 */
    public static final String m43179S0(@C12579k Path path) {
        String obj;
        String substringBeforeLast$default;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path a = path.getFileName();
        if (a == null || (obj = a.toString()) == null || (substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(obj, ".", (String) null, 2, (Object) null)) == null) {
            return "";
        }
        return substringBeforeLast$default;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11665v0(version = "1.5")
    /* renamed from: T0 */
    public static /* synthetic */ void m43180T0(Path path) {
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: U0 */
    public static final UserPrincipal m43181U0(Path path, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    /* renamed from: V0 */
    public static final String m43182V0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toString();
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: W0 */
    public static /* synthetic */ void m43183W0(Path path) {
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: X0 */
    public static final Set<PosixFilePermission> m43184X0(Path path, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        Set<PosixFilePermission> a = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "getPosixFilePermissions(this, *options)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: Y0 */
    public static final boolean m43185Y0(Path path, LinkOption... linkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: Z0 */
    public static final boolean m43186Z0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isExecutable(path);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: a1 */
    public static final boolean m43187a1(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isHidden(path);
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: b0 */
    public static final Path m43188b0(String str) {
        Intrinsics.checkNotNullParameter(str, "path");
        Path a = Paths.get(str, new String[0]);
        Intrinsics.checkNotNullExpressionValue(a, "get(path)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: b1 */
    public static final boolean m43189b1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isReadable(path);
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: c0 */
    public static final Path m43190c0(String str, String... strArr) {
        Intrinsics.checkNotNullParameter(str, "base");
        Intrinsics.checkNotNullParameter(strArr, "subpaths");
        Path a = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "get(base, *subpaths)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: c1 */
    public static final boolean m43191c1(Path path, LinkOption... linkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: d0 */
    public static final Path m43192d0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path a = path.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(a, "toAbsolutePath()");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: d1 */
    public static final boolean m43193d1(Path path, Path path2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: e0 */
    public static final String m43194e0(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: e1 */
    public static final boolean m43195e1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: f0 */
    public static final Path m43196f0(Path path, Path path2, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path a = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "copy(this, target, *options)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: f1 */
    public static final boolean m43197f1(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isWritable(path);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: g0 */
    public static final Path m43198g0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        Intrinsics.checkNotNullParameter(copyOptionArr, "options");
        Path a = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "copy(this, target, *options)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r2);
     */
    @kotlin.C11665v0(version = "1.5")
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    @org.jetbrains.annotations.C12579k
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.nio.file.Path> m43199g1(@org.jetbrains.annotations.C12579k java.nio.file.Path r1, @org.jetbrains.annotations.C12579k java.lang.String r2) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.nio.file.DirectoryStream r2 = kotlin.p010io.path.C11270y0.m43374a(r1)     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch:{ all -> 0x0020 }
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r2)     // Catch:{ all -> 0x0020 }
            r0 = 0
            kotlin.p010io.C11133b.m42950a(r1, r0)
            return r2
        L_0x0020:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11192e3.m43199g1(java.nio.file.Path, java.lang.String):java.util.List");
    }

    /* renamed from: h0 */
    public static /* synthetic */ Path m43200h0(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path a = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "copy(this, target, *options)");
        return a;
    }

    /* renamed from: h1 */
    public static /* synthetic */ List m43201h1(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return m43199g1(path, str);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: i0 */
    public static final Path m43202i0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createDirectories(this, *attributes)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: i1 */
    public static final Path m43203i1(Path path, Path path2, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path a = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "move(this, target, *options)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: j0 */
    public static final Path m43204j0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createDirectory(this, *attributes)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: j1 */
    public static final Path m43205j1(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        Intrinsics.checkNotNullParameter(copyOptionArr, "options");
        Path a = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "move(this, target, *options)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: k0 */
    public static final Path m43206k0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createFile(this, *attributes)");
        return a;
    }

    /* renamed from: k1 */
    public static /* synthetic */ Path m43207k1(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path a = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "move(this, target, *options)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: l0 */
    public static final Path m43208l0(Path path, Path path2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        Path a = Files.createLink(path, path2);
        Intrinsics.checkNotNullExpressionValue(a, "createLink(this, target)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: l1 */
    public static final boolean m43209l1(Path path, LinkOption... linkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: m0 */
    public static final Path m43210m0(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createSymbolicLink(this, target, *attributes)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: m1 */
    public static final /* synthetic */ <A extends BasicFileAttributes> A m43211m1(Path path, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        Intrinsics.reifiedOperationMarker(4, "A");
        BasicFileAttributes a = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "readAttributes(this, A::class.java, *options)");
        return C11263w1.m43362a(a);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: n0 */
    public static final Path m43212n0(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createTempDirectory(prefix, *attributes)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: n1 */
    public static final Map<String, Object> m43213n1(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(str, "attributes");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        Map<String, Object> a = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "readAttributes(this, attributes, *options)");
        return a;
    }

    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    @C12579k
    /* renamed from: o0 */
    public static final Path m43214o0(@C12580l Path path, @C12580l String str, @C12579k FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        if (path != null) {
            Path a = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            Intrinsics.checkNotNullExpressionValue(a, "createTempDirectory(dire…ory, prefix, *attributes)");
            return a;
        }
        Path a2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a2, "createTempDirectory(prefix, *attributes)");
        return a2;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: o1 */
    public static final Path m43215o1(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path a = Files.readSymbolicLink(path);
        Intrinsics.checkNotNullExpressionValue(a, "readSymbolicLink(this)");
        return a;
    }

    /* renamed from: p0 */
    public static /* synthetic */ Path m43216p0(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createTempDirectory(prefix, *attributes)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: p1 */
    public static final Path m43217p1(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "base");
        try {
            return C11198g0.f28384a.mo22654a(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ Path m43218q0(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return m43214o0(path, str, fileAttributeArr);
    }

    @C11097g2(markerClass = {C11241r.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: q1 */
    public static final Path m43219q1(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "base");
        try {
            return C11198g0.f28384a.mo22654a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: r0 */
    public static final Path m43220r0(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createTempFile(prefix, suffix, *attributes)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: r1 */
    public static final Path m43221r1(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "base");
        Path q1 = m43219q1(path, path2);
        if (q1 == null) {
            return path;
        }
        return q1;
    }

    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    @C12579k
    /* renamed from: s0 */
    public static final Path m43222s0(@C12580l Path path, @C12580l String str, @C12580l String str2, @C12579k FileAttribute<?>... fileAttributeArr) throws IOException {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        if (path != null) {
            Path a = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            Intrinsics.checkNotNullExpressionValue(a, "createTempFile(directory…fix, suffix, *attributes)");
            return a;
        }
        Path a2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a2, "createTempFile(prefix, suffix, *attributes)");
        return a2;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: s1 */
    public static final Path m43223s1(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(str, "attribute");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        Path a = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "setAttribute(this, attribute, value, *options)");
        return a;
    }

    /* renamed from: t0 */
    public static /* synthetic */ Path m43224t0(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        Path a = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "createTempFile(prefix, suffix, *attributes)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: t1 */
    public static final Path m43225t1(Path path, FileTime fileTime) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(fileTime, "value");
        Path a = Files.setLastModifiedTime(path, fileTime);
        Intrinsics.checkNotNullExpressionValue(a, "setLastModifiedTime(this, value)");
        return a;
    }

    /* renamed from: u0 */
    public static /* synthetic */ Path m43226u0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return m43222s0(path, str, str2, fileAttributeArr);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: u1 */
    public static final Path m43227u1(Path path, UserPrincipal userPrincipal) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(userPrincipal, "value");
        Path a = Files.setOwner(path, userPrincipal);
        Intrinsics.checkNotNullExpressionValue(a, "setOwner(this, value)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: v0 */
    public static final void m43228v0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Files.delete(path);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: v1 */
    public static final Path m43229v1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(set, "value");
        Path a = Files.setPosixFilePermissions(path, set);
        Intrinsics.checkNotNullExpressionValue(a, "setPosixFilePermissions(this, value)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: w0 */
    public static final boolean m43230w0(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: w1 */
    public static final Path m43231w1(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Path a = Paths.get(uri);
        Intrinsics.checkNotNullExpressionValue(a, "get(this)");
        return a;
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: x0 */
    public static final Path m43232x0(Path path, String str) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(str, "other");
        Path a = path.resolve(str);
        Intrinsics.checkNotNullExpressionValue(a, "this.resolve(other)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r2, r4);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.5")
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m43233x1(java.nio.file.Path r2, java.lang.String r3, kotlin.jvm.functions.C11300l<? super kotlin.sequences.C11559m<? extends java.nio.file.Path>, ? extends T> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r2, r3)
            r3 = 1
            java.nio.file.DirectoryStream r0 = kotlin.p010io.path.C11270y0.m43374a(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x0030 }
            kotlin.sequences.m r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40700v1(r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r4.invoke(r0)     // Catch:{ all -> 0x0030 }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r0 = 0
            kotlin.p010io.C11133b.m42950a(r2, r0)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return r4
        L_0x0030:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            kotlin.p010io.C11133b.m42950a(r2, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11192e3.m43233x1(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.l):java.lang.Object");
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: y0 */
    public static final Path m43234y0(Path path, Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "other");
        Path a = path.resolve(path2);
        Intrinsics.checkNotNullExpressionValue(a, "this.resolve(other)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r0, r1);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        throw r2;
     */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m43235y1(java.nio.file.Path r0, java.lang.String r1, kotlin.jvm.functions.C11300l r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.lang.String r1 = "*"
        L_0x0006:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            java.nio.file.DirectoryStream r1 = kotlin.p010io.path.C11270y0.m43374a(r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch:{ all -> 0x0035 }
            kotlin.sequences.m r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40700v1(r1)     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r2.invoke(r1)     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r0, r2)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            return r1
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            kotlin.p010io.C11133b.m42950a(r0, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11192e3.m43235y1(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.l, int, java.lang.Object):java.lang.Object");
    }

    @C11097g2(markerClass = {C11241r.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: z0 */
    public static final boolean m43236z0(Path path, LinkOption... linkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @C11665v0(version = "1.7")
    @C11241r
    /* renamed from: z1 */
    public static final void m43237z1(@C12579k Path path, int i, boolean z, @C12579k C11300l<? super C11245s, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        m43158A1(path, m43166F0(lVar), i, z);
    }
}
