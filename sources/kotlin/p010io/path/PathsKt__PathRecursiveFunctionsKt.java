package kotlin.p010io.path;

import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11414o;
import kotlin.C11665v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"})
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt */
public class PathsKt__PathRecursiveFunctionsKt extends C11262w0 {

    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$a */
    public /* synthetic */ class C11163a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                kotlin.io.path.CopyActionResult[] r0 = kotlin.p010io.path.CopyActionResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.io.path.CopyActionResult r2 = kotlin.p010io.path.CopyActionResult.CONTINUE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                kotlin.io.path.CopyActionResult r3 = kotlin.p010io.path.CopyActionResult.TERMINATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.io.path.CopyActionResult r3 = kotlin.p010io.path.CopyActionResult.SKIP_SUBTREE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                kotlin.io.path.OnErrorResult[] r0 = kotlin.p010io.path.OnErrorResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.io.path.OnErrorResult r3 = kotlin.p010io.path.OnErrorResult.TERMINATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                kotlin.io.path.OnErrorResult r1 = kotlin.p010io.path.OnErrorResult.SKIP_SUBTREE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.PathsKt__PathRecursiveFunctionsKt.C11163a.<clinit>():void");
        }
    }

    /* renamed from: J */
    public static final void m43106J(C11237q qVar, C11289a<C11079d2> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e) {
            qVar.mo22661a(e);
        }
    }

    @C11665v0(version = "1.8")
    @C12579k
    @C11241r
    /* renamed from: K */
    public static final Path m43107K(@C12579k Path path, @C12579k Path path2, @C12579k C11305q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, boolean z, @C12579k C11305q<? super C11168a, ? super Path, ? super Path, ? extends CopyActionResult> qVar2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        Intrinsics.checkNotNullParameter(qVar, "onError");
        Intrinsics.checkNotNullParameter(qVar2, "copyAction");
        LinkOption[] a = C11265x.f28403a.mo22683a(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a, a.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean z3 = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z || !Files.isSymbolicLink(path))) {
                if (!Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) || Files.isSymbolicLink(path2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 || !Files.isSameFile(path, path2)) {
                    if (Intrinsics.areEqual((Object) path.getFileSystem(), (Object) path2.getFileSystem())) {
                        if (z2) {
                            z3 = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                        } else {
                            Path a2 = path2.getParent();
                            if (a2 != null && Files.exists(a2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && a2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        C11233p.m43283a();
                        throw C11219l1.m43267a(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                    }
                }
            }
            C11192e3.m43160B1(path, 0, z, new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5(qVar2, path, path2, qVar), 1, (Object) null);
            return path2;
        }
        C11223m1.m43274a();
        throw C11215k1.m43263a(path.toString(), path2.toString(), "The source file doesn't exist.");
    }

    @C11665v0(version = "1.8")
    @C12579k
    @C11241r
    /* renamed from: L */
    public static final Path m43108L(@C12579k Path path, @C12579k Path path2, @C12579k C11305q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "target");
        Intrinsics.checkNotNullParameter(qVar, "onError");
        if (z2) {
            return m43107K(path, path2, qVar, z, new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2(z));
        }
        return m43110N(path, path2, qVar, z, (C11305q) null, 8, (Object) null);
    }

    /* renamed from: M */
    public static final FileVisitResult m43109M(C11305q<? super C11168a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, C11305q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return m43121Y((CopyActionResult) qVar.invoke(C11188e.f28383a, path3, m43112P(path, path2, path3)));
        } catch (Exception e) {
            return m43113Q(qVar2, path, path2, path3, e);
        }
    }

    /* renamed from: N */
    public static /* synthetic */ Path m43110N(Path path, Path path2, C11305q qVar, boolean z, C11305q qVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            qVar = PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3.f28382f;
        }
        if ((i & 8) != 0) {
            qVar2 = new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4(z);
        }
        return m43107K(path, path2, qVar, z, qVar2);
    }

    /* renamed from: O */
    public static /* synthetic */ Path m43111O(Path path, Path path2, C11305q qVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            qVar = PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1.f28381f;
        }
        return m43108L(path, path2, qVar, z, z2);
    }

    /* renamed from: P */
    public static final Path m43112P(Path path, Path path2, Path path3) {
        Path a = path2.resolve(C11192e3.m43217p1(path3, path).toString());
        Intrinsics.checkNotNullExpressionValue(a, "target.resolve(relativePath.pathString)");
        return a;
    }

    /* renamed from: Q */
    public static final FileVisitResult m43113Q(C11305q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2, Path path3, Exception exc) {
        return m43122Z((OnErrorResult) qVar.invoke(path3, m43112P(path, path2, path3), exc));
    }

    @C11665v0(version = "1.8")
    @C11241r
    /* renamed from: R */
    public static final void m43114R(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        List<Exception> S = m43115S(path);
        if (!S.isEmpty()) {
            C11233p.m43283a();
            FileSystemException a = C11229o.m43279a("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception a2 : S) {
                C11414o.m43942a(a, a2);
            }
            throw a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        kotlin.p010io.C11133b.m42950a(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        throw r0;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.Exception> m43115S(java.nio.file.Path r8) {
        /*
            kotlin.io.path.q r0 = new kotlin.io.path.q
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.nio.file.Path r4 = r8.getParent()
            if (r4 == 0) goto L_0x0043
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r4)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r5 = r3
        L_0x0014:
            if (r5 == 0) goto L_0x0043
            java.nio.file.DirectoryStream r6 = kotlin.p010io.path.C11270y0.m43374a(r5)     // Catch:{ all -> 0x003c }
            boolean r7 = kotlin.p010io.path.C11274z0.m43378a(r6)     // Catch:{ all -> 0x003c }
            if (r7 == 0) goto L_0x0034
            r0.mo22667g(r4)     // Catch:{ all -> 0x003c }
            java.nio.file.SecureDirectoryStream r2 = kotlin.p010io.path.C11170a1.m43135a(r6)     // Catch:{ all -> 0x003c }
            java.nio.file.Path r4 = r8.getFileName()     // Catch:{ all -> 0x003c }
            java.lang.String r6 = "this.fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch:{ all -> 0x003c }
            m43117U(r2, r4, r0)     // Catch:{ all -> 0x003c }
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003c }
            kotlin.p010io.C11133b.m42950a(r5, r3)
            r2 = r1
            goto L_0x0043
        L_0x003c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r5, r8)
            throw r0
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            m43119W(r8, r0)
        L_0x0048:
            java.util.List r8 = r0.mo22664d()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.PathsKt__PathRecursiveFunctionsKt.m43115S(java.nio.file.Path):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        throw r0;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43116T(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r4, java.nio.file.Path r5, kotlin.p010io.path.C11237q r6) {
        /*
            r0 = 1
            r1 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]     // Catch:{ NoSuchFileException -> 0x0012 }
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch:{ NoSuchFileException -> 0x0012 }
            r3 = 0
            r0[r3] = r2     // Catch:{ NoSuchFileException -> 0x0012 }
            java.nio.file.SecureDirectoryStream r4 = r4.newDirectoryStream(r5, r0)     // Catch:{ NoSuchFileException -> 0x0012 }
            goto L_0x0013
        L_0x0010:
            r4 = move-exception
            goto L_0x0045
        L_0x0012:
            r4 = r1
        L_0x0013:
            if (r4 == 0) goto L_0x0048
            java.nio.file.SecureDirectoryStream r5 = kotlin.p010io.path.C11170a1.m43135a(r4)     // Catch:{ all -> 0x003e }
            java.util.Iterator r0 = r5.iterator()     // Catch:{ all -> 0x003e }
        L_0x001d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x003e }
            java.nio.file.Path r2 = com.fasterxml.jackson.databind.ext.C14969a.m64318a(r2)     // Catch:{ all -> 0x003e }
            java.nio.file.Path r2 = r2.getFileName()     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "entry.fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ all -> 0x003e }
            m43117U(r5, r2, r6)     // Catch:{ all -> 0x003e }
            goto L_0x001d
        L_0x0038:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003e }
            kotlin.p010io.C11133b.m42950a(r4, r1)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0048
        L_0x003e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r5)     // Catch:{ Exception -> 0x0010 }
            throw r0     // Catch:{ Exception -> 0x0010 }
        L_0x0045:
            r6.mo22661a(r4)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.PathsKt__PathRecursiveFunctionsKt.m43116T(java.nio.file.SecureDirectoryStream, java.nio.file.Path, kotlin.io.path.q):void");
    }

    /* renamed from: U */
    public static final void m43117U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, C11237q qVar) {
        qVar.mo22662b(path);
        try {
            if (m43120X(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
                int f = qVar.mo22666f();
                m43116T(secureDirectoryStream, path, qVar);
                if (f == qVar.mo22666f()) {
                    try {
                        secureDirectoryStream.deleteDirectory(path);
                        C11079d2 d2Var = C11079d2.f28267a;
                    } catch (NoSuchFileException unused) {
                    }
                }
            } else {
                secureDirectoryStream.deleteFile(path);
                C11079d2 d2Var2 = C11079d2.f28267a;
            }
        } catch (Exception e) {
            qVar.mo22661a(e);
        }
        qVar.mo22663c(path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        throw r1;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43118V(java.nio.file.Path r4, kotlin.p010io.path.C11237q r5) {
        /*
            r0 = 0
            java.nio.file.DirectoryStream r4 = java.nio.file.Files.newDirectoryStream(r4)     // Catch:{ NoSuchFileException -> 0x0008 }
            goto L_0x0009
        L_0x0006:
            r4 = move-exception
            goto L_0x0037
        L_0x0008:
            r4 = r0
        L_0x0009:
            if (r4 == 0) goto L_0x003a
            java.nio.file.DirectoryStream r1 = kotlin.p010io.path.C11270y0.m43374a(r4)     // Catch:{ all -> 0x0030 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0030 }
            java.nio.file.Path r2 = com.fasterxml.jackson.databind.ext.C14969a.m64318a(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ all -> 0x0030 }
            m43119W(r2, r5)     // Catch:{ all -> 0x0030 }
            goto L_0x0013
        L_0x002a:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0030 }
            kotlin.p010io.C11133b.m42950a(r4, r0)     // Catch:{ Exception -> 0x0006 }
            goto L_0x003a
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r0)     // Catch:{ Exception -> 0x0006 }
            throw r1     // Catch:{ Exception -> 0x0006 }
        L_0x0037:
            r5.mo22661a(r4)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.PathsKt__PathRecursiveFunctionsKt.m43118V(java.nio.file.Path, kotlin.io.path.q):void");
    }

    /* renamed from: W */
    public static final void m43119W(Path path, C11237q qVar) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int f = qVar.mo22666f();
                m43118V(path, qVar);
                if (f == qVar.mo22666f()) {
                    boolean unused = Files.deleteIfExists(path);
                    return;
                }
                return;
            }
            boolean unused2 = Files.deleteIfExists(path);
        } catch (Exception e) {
            qVar.mo22661a(e);
        }
    }

    /* renamed from: X */
    public static final boolean m43120X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(C11235p1.m43285a(secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @C11241r
    /* renamed from: Y */
    public static final FileVisitResult m43121Y(CopyActionResult copyActionResult) {
        int i = C11163a.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @C11241r
    /* renamed from: Z */
    public static final FileVisitResult m43122Z(OnErrorResult onErrorResult) {
        int i = C11163a.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a0 */
    public static final <R> R m43123a0(C11289a<? extends R> aVar) {
        try {
            return aVar.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
