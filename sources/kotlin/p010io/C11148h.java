package kotlin.p010io;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10899a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.io.h */
public final class C11148h implements C11559m<File> {
    @C12579k

    /* renamed from: a */
    public final File f28335a;
    @C12579k

    /* renamed from: b */
    public final FileWalkDirection f28336b;
    @C12580l

    /* renamed from: c */
    public final C11300l<File, Boolean> f28337c;
    @C12580l

    /* renamed from: d */
    public final C11300l<File, C11079d2> f28338d;
    @C12580l

    /* renamed from: e */
    public final C11304p<File, IOException, C11079d2> f28339e;

    /* renamed from: f */
    public final int f28340f;

    @C11363r0({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* renamed from: kotlin.io.h$a */
    public static abstract class C11149a extends C11155c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11149a(@C12579k File file) {
            super(file);
            Intrinsics.checkNotNullParameter(file, "rootDir");
        }
    }

    /* renamed from: kotlin.io.h$b */
    public final class C11150b extends C10899a<File> {
        @C12579k

        /* renamed from: c */
        public final ArrayDeque<C11155c> f28341c;

        /* renamed from: kotlin.io.h$b$a */
        public final class C11151a extends C11149a {

            /* renamed from: b */
            public boolean f28343b;
            @C12580l

            /* renamed from: c */
            public File[] f28344c;

            /* renamed from: d */
            public int f28345d;

            /* renamed from: e */
            public boolean f28346e;

            /* renamed from: f */
            public final /* synthetic */ C11150b f28347f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11151a(@C12579k C11150b bVar, File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "rootDir");
                this.f28347f = bVar;
            }

            @C12580l
            /* renamed from: b */
            public File mo22622b() {
                if (!this.f28346e && this.f28344c == null) {
                    C11300l e = C11148h.this.f28337c;
                    boolean z = false;
                    if (e != null && !((Boolean) e.invoke(mo22623a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = mo22623a().listFiles();
                    this.f28344c = listFiles;
                    if (listFiles == null) {
                        C11304p f = C11148h.this.f28339e;
                        if (f != null) {
                            f.invoke(mo22623a(), new AccessDeniedException(mo22623a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f28346e = true;
                    }
                }
                File[] fileArr = this.f28344c;
                if (fileArr != null) {
                    int i = this.f28345d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f28344c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i2 = this.f28345d;
                        this.f28345d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f28343b) {
                    this.f28343b = true;
                    return mo22623a();
                }
                C11300l g = C11148h.this.f28338d;
                if (g != null) {
                    g.invoke(mo22623a());
                }
                return null;
            }
        }

        @C11363r0({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: kotlin.io.h$b$b */
        public final class C11152b extends C11155c {

            /* renamed from: b */
            public boolean f28348b;

            /* renamed from: c */
            public final /* synthetic */ C11150b f28349c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11152b(@C12579k C11150b bVar, File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "rootFile");
                this.f28349c = bVar;
            }

            @C12580l
            /* renamed from: b */
            public File mo22622b() {
                if (this.f28348b) {
                    return null;
                }
                this.f28348b = true;
                return mo22623a();
            }
        }

        /* renamed from: kotlin.io.h$b$c */
        public final class C11153c extends C11149a {

            /* renamed from: b */
            public boolean f28350b;
            @C12580l

            /* renamed from: c */
            public File[] f28351c;

            /* renamed from: d */
            public int f28352d;

            /* renamed from: e */
            public final /* synthetic */ C11150b f28353e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11153c(@C12579k C11150b bVar, File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "rootDir");
                this.f28353e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            @org.jetbrains.annotations.C12580l
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo22622b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f28350b
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    kotlin.io.h$b r0 = r10.f28353e
                    kotlin.io.h r0 = kotlin.p010io.C11148h.this
                    kotlin.jvm.functions.l r0 = r0.f28337c
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.mo22623a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = r3
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f28350b = r3
                    java.io.File r0 = r10.mo22623a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f28351c
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f28352d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    kotlin.io.h$b r0 = r10.f28353e
                    kotlin.io.h r0 = kotlin.p010io.C11148h.this
                    kotlin.jvm.functions.l r0 = r0.f28338d
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.mo22623a()
                    r0.invoke(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f28351c
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.mo22623a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f28351c = r0
                    if (r0 != 0) goto L_0x007b
                    kotlin.io.h$b r0 = r10.f28353e
                    kotlin.io.h r0 = kotlin.p010io.C11148h.this
                    kotlin.jvm.functions.p r0 = r0.f28339e
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.mo22623a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.mo22623a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f28351c
                    if (r0 == 0) goto L_0x0085
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    kotlin.io.h$b r0 = r10.f28353e
                    kotlin.io.h r0 = kotlin.p010io.C11148h.this
                    kotlin.jvm.functions.l r0 = r0.f28338d
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.mo22623a()
                    r0.invoke(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f28351c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.f28352d
                    int r2 = r1 + 1
                    r10.f28352d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.C11148h.C11150b.C11153c.mo22622b():java.io.File");
            }
        }

        /* renamed from: kotlin.io.h$b$d */
        public /* synthetic */ class C11154d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    kotlin.io.FileWalkDirection[] r0 = kotlin.p010io.FileWalkDirection.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.io.FileWalkDirection r1 = kotlin.p010io.FileWalkDirection.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    kotlin.io.FileWalkDirection r1 = kotlin.p010io.FileWalkDirection.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.C11148h.C11150b.C11154d.<clinit>():void");
            }
        }

        public C11150b() {
            ArrayDeque<C11155c> arrayDeque = new ArrayDeque<>();
            this.f28341c = arrayDeque;
            if (C11148h.this.f28335a.isDirectory()) {
                arrayDeque.push(mo22620f(C11148h.this.f28335a));
            } else if (C11148h.this.f28335a.isFile()) {
                arrayDeque.push(new C11152b(this, C11148h.this.f28335a));
            } else {
                mo22037c();
            }
        }

        /* renamed from: b */
        public void mo22036b() {
            File h = mo22621h();
            if (h != null) {
                mo22038d(h);
            } else {
                mo22037c();
            }
        }

        /* renamed from: f */
        public final C11149a mo22620f(File file) {
            int i = C11154d.$EnumSwitchMapping$0[C11148h.this.f28336b.ordinal()];
            if (i == 1) {
                return new C11153c(this, file);
            }
            if (i == 2) {
                return new C11151a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: h */
        public final File mo22621h() {
            File b;
            while (true) {
                C11155c peek = this.f28341c.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.mo22622b();
                if (b == null) {
                    this.f28341c.pop();
                } else if (Intrinsics.areEqual((Object) b, (Object) peek.mo22623a()) || !b.isDirectory() || this.f28341c.size() >= C11148h.this.f28340f) {
                    return b;
                } else {
                    this.f28341c.push(mo22620f(b));
                }
            }
            return b;
        }
    }

    /* renamed from: kotlin.io.h$c */
    public static abstract class C11155c {
        @C12579k

        /* renamed from: a */
        public final File f28354a;

        public C11155c(@C12579k File file) {
            Intrinsics.checkNotNullParameter(file, C10108c.f27819v);
            this.f28354a = file;
        }

        @C12579k
        /* renamed from: a */
        public final File mo22623a() {
            return this.f28354a;
        }

        @C12580l
        /* renamed from: b */
        public abstract File mo22622b();
    }

    public C11148h(File file, FileWalkDirection fileWalkDirection, C11300l<? super File, Boolean> lVar, C11300l<? super File, C11079d2> lVar2, C11304p<? super File, ? super IOException, C11079d2> pVar, int i) {
        this.f28335a = file;
        this.f28336b = fileWalkDirection;
        this.f28337c = lVar;
        this.f28338d = lVar2;
        this.f28339e = pVar;
        this.f28340f = i;
    }

    @C12579k
    /* renamed from: i */
    public final C11148h mo22616i(int i) {
        if (i > 0) {
            return new C11148h(this.f28335a, this.f28336b, this.f28337c, this.f28338d, this.f28339e, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @C12579k
    public Iterator<File> iterator() {
        return new C11150b();
    }

    @C12579k
    /* renamed from: j */
    public final C11148h mo22617j(@C12579k C11300l<? super File, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "function");
        return new C11148h(this.f28335a, this.f28336b, lVar, this.f28338d, this.f28339e, this.f28340f);
    }

    @C12579k
    /* renamed from: k */
    public final C11148h mo22618k(@C12579k C11304p<? super File, ? super IOException, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "function");
        return new C11148h(this.f28335a, this.f28336b, this.f28337c, this.f28338d, pVar, this.f28340f);
    }

    @C12579k
    /* renamed from: l */
    public final C11148h mo22619l(@C12579k C11300l<? super File, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "function");
        return new C11148h(this.f28335a, this.f28336b, this.f28337c, lVar, this.f28339e, this.f28340f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11148h(File file, FileWalkDirection fileWalkDirection, C11300l lVar, C11300l lVar2, C11304p pVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11148h(@C12579k File file, @C12579k FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, (C11300l) null, (C11300l) null, (C11304p) null, 0, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(file, "start");
        Intrinsics.checkNotNullParameter(fileWalkDirection, "direction");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11148h(File file, FileWalkDirection fileWalkDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
