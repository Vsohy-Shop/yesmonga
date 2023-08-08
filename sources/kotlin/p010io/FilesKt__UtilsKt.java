package kotlin.p010io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11395k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1266#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* renamed from: kotlin.io.FilesKt__UtilsKt */
public class FilesKt__UtilsKt extends C11158k {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[Catch:{ TerminateException -> 0x00dc }] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m42875N(@org.jetbrains.annotations.C12579k java.io.File r11, @org.jetbrains.annotations.C12579k java.io.File r12, boolean r13, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.io.File, ? super java.io.IOException, ? extends kotlin.p010io.OnErrorAction> r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002e
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r7 = 2
            r8 = 0
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.p010io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            return r1
        L_0x002e:
            kotlin.io.h r0 = kotlin.p010io.C11158k.m43077M(r11)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch:{ TerminateException -> 0x00dc }
            r3.<init>(r14)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.h r0 = r0.mo22618k(r3)     // Catch:{ TerminateException -> 0x00dc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ TerminateException -> 0x00dc }
        L_0x003f:
            boolean r3 = r0.hasNext()     // Catch:{ TerminateException -> 0x00dc }
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r0.next()     // Catch:{ TerminateException -> 0x00dc }
            java.io.File r3 = (java.io.File) r3     // Catch:{ TerminateException -> 0x00dc }
            boolean r4 = r3.exists()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x0066
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch:{ TerminateException -> 0x00dc }
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ TerminateException -> 0x00dc }
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.OnErrorAction r4 = kotlin.p010io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x0066:
            java.lang.String r4 = m42901n0(r3, r11)     // Catch:{ TerminateException -> 0x00dc }
            java.io.File r5 = new java.io.File     // Catch:{ TerminateException -> 0x00dc }
            r5.<init>(r12, r4)     // Catch:{ TerminateException -> 0x00dc }
            boolean r4 = r5.exists()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r3.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x0081
            boolean r4 = r5.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x00ac
        L_0x0081:
            if (r13 != 0) goto L_0x0085
        L_0x0083:
            r4 = r1
            goto L_0x009a
        L_0x0085:
            boolean r4 = r5.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x0092
            boolean r4 = m42883V(r5)     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0092:
            boolean r4 = r5.delete()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0099:
            r4 = r2
        L_0x009a:
            if (r4 == 0) goto L_0x00ac
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch:{ TerminateException -> 0x00dc }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ TerminateException -> 0x00dc }
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.OnErrorAction r4 = kotlin.p010io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00ac:
            boolean r4 = r3.isDirectory()     // Catch:{ TerminateException -> 0x00dc }
            if (r4 == 0) goto L_0x00b6
            r5.mkdirs()     // Catch:{ TerminateException -> 0x00dc }
            goto L_0x003f
        L_0x00b6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = m42878Q(r4, r5, r6, r7, r8, r9)     // Catch:{ TerminateException -> 0x00dc }
            long r4 = r4.length()     // Catch:{ TerminateException -> 0x00dc }
            long r6 = r3.length()     // Catch:{ TerminateException -> 0x00dc }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x003f
            java.io.IOException r4 = new java.io.IOException     // Catch:{ TerminateException -> 0x00dc }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ TerminateException -> 0x00dc }
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch:{ TerminateException -> 0x00dc }
            kotlin.io.OnErrorAction r4 = kotlin.p010io.OnErrorAction.TERMINATE     // Catch:{ TerminateException -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00db:
            return r1
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__UtilsKt.m42875N(java.io.File, java.io.File, boolean, kotlin.jvm.functions.p):boolean");
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m42876O(File file, File file2, boolean z, C11304p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            pVar = FilesKt__UtilsKt$copyRecursively$1.f28289f;
        }
        return m42875N(file, file2, z, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        kotlin.p010io.C11133b.m42950a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        kotlin.p010io.C11133b.m42950a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        throw r7;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m42877P(@org.jetbrains.annotations.C12579k java.io.File r6, @org.jetbrains.annotations.C12579k java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0070
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0069 }
            r6.<init>(r7)     // Catch:{ all -> 0x0069 }
            kotlin.p010io.C11131a.m42931k(r8, r6, r9)     // Catch:{ all -> 0x0062 }
            r9 = 0
            kotlin.p010io.C11133b.m42950a(r6, r9)     // Catch:{ all -> 0x0069 }
            kotlin.p010io.C11133b.m42950a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            kotlin.p010io.C11133b.m42950a(r6, r7)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r7 = move-exception
            kotlin.p010io.C11133b.m42950a(r8, r6)
            throw r7
        L_0x0070:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r4 = 2
            r5 = 0
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__UtilsKt.m42877P(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* renamed from: Q */
    public static /* synthetic */ File m42878Q(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m42877P(file, file2, z, i);
    }

    @C11395k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @C12579k
    /* renamed from: R */
    public static final File m42879R(@C12579k String str, @C12580l String str2, @C12580l File file) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            Intrinsics.checkNotNullExpressionValue(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    /* renamed from: S */
    public static /* synthetic */ File m42880S(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m42879R(str, str2, file);
    }

    @C11395k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @C12579k
    /* renamed from: T */
    public static final File m42881T(@C12579k String str, @C12580l String str2, @C12580l File file) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    /* renamed from: U */
    public static /* synthetic */ File m42882U(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m42881T(str, str2, file);
    }

    /* renamed from: V */
    public static final boolean m42883V(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Iterator it = C11158k.m43076L(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: W */
    public static final boolean m42884W(@C12579k File file, @C12579k File file2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "other");
        C11147g f = C11157j.m43073f(file);
        C11147g f2 = C11157j.m43073f(file2);
        if (f2.mo22613i()) {
            return Intrinsics.areEqual((Object) file, (Object) file2);
        }
        int h = f.mo22611h() - f2.mo22611h();
        if (h < 0) {
            return false;
        }
        return f.mo22610g().subList(h, f.mo22611h()).equals(f2.mo22610g());
    }

    /* renamed from: X */
    public static final boolean m42885X(@C12579k File file, @C12579k String str) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(str, "other");
        return m42884W(file, new File(str));
    }

    @C12579k
    /* renamed from: Y */
    public static final String m42886Y(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return StringsKt__StringsKt.substringAfterLast(name, '.', "");
    }

    @C12579k
    /* renamed from: Z */
    public static final String m42887Z(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "path");
            return C11622t.replace$default(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        return path2;
    }

    @C12579k
    /* renamed from: a0 */
    public static final String m42888a0(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return StringsKt__StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    @C12579k
    /* renamed from: b0 */
    public static final File m42889b0(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        C11147g f = C11157j.m43073f(file);
        File e = f.mo22607e();
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "separator");
        return m42896i0(e, CollectionsKt___CollectionsKt.m40639h3(m42890c0(f.mo22610g()), str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
    }

    /* renamed from: c0 */
    public static final List<File> m42890c0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual((Object) name, (Object) ".")) {
                if (!Intrinsics.areEqual((Object) name, (Object) "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual((Object) ((File) CollectionsKt___CollectionsKt.m40653k3(arrayList)).getName(), (Object) "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public static final C11147g m42891d0(C11147g gVar) {
        return new C11147g(gVar.mo22607e(), m42890c0(gVar.mo22610g()));
    }

    @C12579k
    /* renamed from: e0 */
    public static final File m42892e0(@C12579k File file, @C12579k File file2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "base");
        return new File(m42901n0(file, file2));
    }

    @C12580l
    /* renamed from: f0 */
    public static final File m42893f0(@C12579k File file, @C12579k File file2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "base");
        String o0 = m42902o0(file, file2);
        if (o0 != null) {
            return new File(o0);
        }
        return null;
    }

    @C12579k
    /* renamed from: g0 */
    public static final File m42894g0(@C12579k File file, @C12579k File file2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "base");
        String o0 = m42902o0(file, file2);
        if (o0 != null) {
            return new File(o0);
        }
        return file;
    }

    @C12579k
    /* renamed from: h0 */
    public static final File m42895h0(@C12579k File file, @C12579k File file2) {
        boolean z;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "relative");
        if (C11157j.m43071d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file3, "this.toString()");
        if (file3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || StringsKt__StringsKt.endsWith$default((CharSequence) file3, File.separatorChar, false, 2, (Object) null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    @C12579k
    /* renamed from: i0 */
    public static final File m42896i0(@C12579k File file, @C12579k String str) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(str, "relative");
        return m42895h0(file, new File(str));
    }

    @C12579k
    /* renamed from: j0 */
    public static final File m42897j0(@C12579k File file, @C12579k File file2) {
        File file3;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "relative");
        C11147g f = C11157j.m43073f(file);
        if (f.mo22611h() == 0) {
            file3 = new File("..");
        } else {
            file3 = f.mo22614j(0, f.mo22611h() - 1);
        }
        return m42895h0(m42895h0(f.mo22607e(), file3), file2);
    }

    @C12579k
    /* renamed from: k0 */
    public static final File m42898k0(@C12579k File file, @C12579k String str) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(str, "relative");
        return m42897j0(file, new File(str));
    }

    /* renamed from: l0 */
    public static final boolean m42899l0(@C12579k File file, @C12579k File file2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "other");
        C11147g f = C11157j.m43073f(file);
        C11147g f2 = C11157j.m43073f(file2);
        if (Intrinsics.areEqual((Object) f.mo22607e(), (Object) f2.mo22607e()) && f.mo22611h() >= f2.mo22611h()) {
            return f.mo22610g().subList(0, f2.mo22611h()).equals(f2.mo22610g());
        }
        return false;
    }

    /* renamed from: m0 */
    public static final boolean m42900m0(@C12579k File file, @C12579k String str) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(str, "other");
        return m42899l0(file, new File(str));
    }

    @C12579k
    /* renamed from: n0 */
    public static final String m42901n0(@C12579k File file, @C12579k File file2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(file2, "base");
        String o0 = m42902o0(file, file2);
        if (o0 != null) {
            return o0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    /* renamed from: o0 */
    public static final String m42902o0(File file, File file2) {
        C11147g d0 = m42891d0(C11157j.m43073f(file));
        C11147g d02 = m42891d0(C11157j.m43073f(file2));
        if (!Intrinsics.areEqual((Object) d0.mo22607e(), (Object) d02.mo22607e())) {
            return null;
        }
        int h = d02.mo22611h();
        int h2 = d0.mo22611h();
        int min = Math.min(h2, h);
        int i = 0;
        while (i < min && Intrinsics.areEqual((Object) d0.mo22610g().get(i), (Object) d02.mo22610g().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = h - 1;
        if (i <= i2) {
            while (!Intrinsics.areEqual((Object) d02.mo22610g().get(i2).getName(), (Object) "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < h2) {
            if (i < h) {
                sb.append(File.separatorChar);
            }
            String str = File.separator;
            Intrinsics.checkNotNullExpressionValue(str, "separator");
            CollectionsKt___CollectionsKt.m40629f3(CollectionsKt___CollectionsKt.m40588X1(d0.mo22610g(), i), sb, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 124, (Object) null);
        }
        return sb.toString();
    }
}
