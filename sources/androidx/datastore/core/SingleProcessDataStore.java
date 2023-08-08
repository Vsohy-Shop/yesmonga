package androidx.datastore.core;

import androidx.annotation.C0323b0;
import androidx.camera.core.ImageSaver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12169x;
import kotlinx.coroutines.C12179z;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SingleProcessDataStore<T> implements C18570d<T> {
    @C12579k

    /* renamed from: k */
    public static final C18559a f47394k = new C18559a((DefaultConstructorMarker) null);
    @C0323b0("activeFilesLock")
    @C12579k

    /* renamed from: l */
    public static final Set<String> f47395l = new LinkedHashSet();
    @C12579k

    /* renamed from: m */
    public static final Object f47396m = new Object();
    @C12579k

    /* renamed from: a */
    public final C11289a<File> f47397a;
    @C12579k

    /* renamed from: b */
    public final C18577i<T> f47398b;
    @C12579k

    /* renamed from: c */
    public final C18567a<T> f47399c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f47400d;
    @C12579k

    /* renamed from: e */
    public final C11907e<T> f47401e;
    @C12579k

    /* renamed from: f */
    public final String f47402f;
    @C12579k

    /* renamed from: g */
    public final C11677z f47403g;
    @C12579k

    /* renamed from: h */
    public final C11940j<C18578j<T>> f47404h;
    @C12580l

    /* renamed from: i */
    public List<? extends C11304p<? super C18573g<T>, ? super C11045c<? super C11079d2>, ? extends Object>> f47405i;
    @C12579k

    /* renamed from: j */
    public final SimpleActor<C18560b<T>> f47406j;

    /* renamed from: androidx.datastore.core.SingleProcessDataStore$a */
    public static final class C18559a {
        public /* synthetic */ C18559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final Set<String> mo53555a() {
            return SingleProcessDataStore.f47395l;
        }

        @C12579k
        /* renamed from: b */
        public final Object mo53556b() {
            return SingleProcessDataStore.f47396m;
        }

        public C18559a() {
        }
    }

    /* renamed from: androidx.datastore.core.SingleProcessDataStore$b */
    public static abstract class C18560b<T> {

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$b$a */
        public static final class C18561a<T> extends C18560b<T> {
            @C12580l

            /* renamed from: a */
            public final C18578j<T> f47407a;

            public C18561a(@C12580l C18578j<T> jVar) {
                super((DefaultConstructorMarker) null);
                this.f47407a = jVar;
            }

            @C12580l
            /* renamed from: a */
            public C18578j<T> mo53557a() {
                return this.f47407a;
            }
        }

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$b$b */
        public static final class C18562b<T> extends C18560b<T> {
            @C12579k

            /* renamed from: a */
            public final C11304p<T, C11045c<? super T>, Object> f47408a;
            @C12579k

            /* renamed from: b */
            public final C12169x<T> f47409b;
            @C12580l

            /* renamed from: c */
            public final C18578j<T> f47410c;
            @C12579k

            /* renamed from: d */
            public final CoroutineContext f47411d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18562b(@C12579k C11304p<? super T, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C12169x<T> xVar, @C12580l C18578j<T> jVar, @C12579k CoroutineContext coroutineContext) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(pVar, "transform");
                Intrinsics.checkNotNullParameter(xVar, "ack");
                Intrinsics.checkNotNullParameter(coroutineContext, "callerContext");
                this.f47408a = pVar;
                this.f47409b = xVar;
                this.f47410c = jVar;
                this.f47411d = coroutineContext;
            }

            @C12580l
            /* renamed from: a */
            public C18578j<T> mo53557a() {
                return this.f47410c;
            }

            @C12579k
            /* renamed from: b */
            public final C12169x<T> mo53558b() {
                return this.f47409b;
            }

            @C12579k
            /* renamed from: c */
            public final CoroutineContext mo53559c() {
                return this.f47411d;
            }

            @C12579k
            /* renamed from: d */
            public final C11304p<T, C11045c<? super T>, Object> mo53560d() {
                return this.f47408a;
            }
        }

        public /* synthetic */ C18560b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public abstract C18578j<T> mo53557a();

        public C18560b() {
        }
    }

    /* renamed from: androidx.datastore.core.SingleProcessDataStore$c */
    public static final class C18563c extends OutputStream {
        @C12579k

        /* renamed from: a */
        public final FileOutputStream f47412a;

        public C18563c(@C12579k FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.f47412a = fileOutputStream;
        }

        @C12579k
        /* renamed from: a */
        public final FileOutputStream mo53561a() {
            return this.f47412a;
        }

        public void close() {
        }

        public void flush() {
            this.f47412a.flush();
        }

        public void write(int i) {
            this.f47412a.write(i);
        }

        public void write(@C12579k byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "b");
            this.f47412a.write(bArr);
        }

        public void write(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "bytes");
            this.f47412a.write(bArr, i, i2);
        }
    }

    public SingleProcessDataStore(@C12579k C11289a<? extends File> aVar, @C12579k C18577i<T> iVar, @C12579k List<? extends C11304p<? super C18573g<T>, ? super C11045c<? super C11079d2>, ? extends Object>> list, @C12579k C18567a<T> aVar2, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        Intrinsics.checkNotNullParameter(iVar, "serializer");
        Intrinsics.checkNotNullParameter(list, "initTasksList");
        Intrinsics.checkNotNullParameter(aVar2, "corruptionHandler");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f47397a = aVar;
        this.f47398b = iVar;
        this.f47399c = aVar2;
        this.f47400d = o0Var;
        this.f47401e = C11909g.m47376J0(new SingleProcessDataStore$data$1(this, (C11045c<? super SingleProcessDataStore$data$1>) null));
        this.f47402f = ImageSaver.f3843w;
        this.f47403g = C10864b0.m38748c(new SingleProcessDataStore$file$2(this));
        this.f47404h = C11953v.m47628a(C18579k.f47426a);
        this.f47405i = CollectionsKt___CollectionsKt.m40557Q5(list);
        this.f47406j = new SimpleActor<>(o0Var, new SingleProcessDataStore$actor$1(this), SingleProcessDataStore$actor$2.f47415f, new SingleProcessDataStore$actor$3(this, (C11045c<? super SingleProcessDataStore$actor$3>) null));
    }

    /* renamed from: q */
    public static /* synthetic */ void m84020q() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:25:0x0092, B:33:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0 A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53542A(T r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.L$4
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.L$3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$2
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.L$1
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x003d }
            goto L_0x0089
        L_0x003d:
            r8 = move-exception
            goto L_0x00be
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            kotlin.C11661u0.m45747n(r9)
            java.io.File r9 = r7.mo53546r()
            r7.mo53545p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.mo53546r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f47402f
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c7 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00c7 }
            androidx.datastore.core.i<T> r4 = r7.f47398b     // Catch:{ all -> 0x00bc }
            androidx.datastore.core.SingleProcessDataStore$c r5 = new androidx.datastore.core.SingleProcessDataStore$c     // Catch:{ all -> 0x00bc }
            r5.<init>(r2)     // Catch:{ all -> 0x00bc }
            r0.L$0 = r7     // Catch:{ all -> 0x00bc }
            r0.L$1 = r9     // Catch:{ all -> 0x00bc }
            r0.L$2 = r2     // Catch:{ all -> 0x00bc }
            r6 = 0
            r0.L$3 = r6     // Catch:{ all -> 0x00bc }
            r0.L$4 = r2     // Catch:{ all -> 0x00bc }
            r0.label = r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r4.mo31156a(r8, r5, r0)     // Catch:{ all -> 0x00bc }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L_0x0089:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            kotlin.d2 r8 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003d }
            kotlin.p010io.C11133b.m42950a(r2, r1)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r9 = r0.mo53546r()     // Catch:{ IOException -> 0x00c4 }
            boolean r9 = r3.renameTo(r9)     // Catch:{ IOException -> 0x00c4 }
            if (r9 == 0) goto L_0x00a0
            return r8
        L_0x00a0:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00c4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c4 }
            r9.<init>()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            r9.append(r3)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00c4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00c4 }
            throw r8     // Catch:{ IOException -> 0x00c4 }
        L_0x00bc:
            r8 = move-exception
            r3 = r9
        L_0x00be:
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r9 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r8)     // Catch:{ IOException -> 0x00c4 }
            throw r9     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            r8 = move-exception
            r9 = r3
            goto L_0x00c8
        L_0x00c7:
            r8 = move-exception
        L_0x00c8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d1
            r9.delete()
        L_0x00d1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53542A(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: a */
    public Object mo53543a(@C12579k C11304p<? super T, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        C12169x c = C12179z.m48761c((C11723c2) null, 1, (Object) null);
        this.f47406j.mo53539e(new C18560b.C18562b(pVar, c, this.f47404h.getValue(), cVar.getContext()));
        return c.mo24780v(cVar);
    }

    @C12579k
    public C11907e<T> getData() {
        return this.f47401e;
    }

    /* renamed from: p */
    public final void mo53545p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
            }
        }
    }

    /* renamed from: r */
    public final File mo53546r() {
        return (File) this.f47403g.getValue();
    }

    /* renamed from: s */
    public final Object mo53547s(C18560b.C18561a<T> aVar, C11045c<? super C11079d2> cVar) {
        C18578j<T> value = this.f47404h.getValue();
        if (!(value instanceof C18568b)) {
            if (value instanceof C18574h) {
                if (value == aVar.mo53557a()) {
                    Object w = mo53551w(cVar);
                    if (w == C11063b.m42612h()) {
                        return w;
                    }
                    return C11079d2.f28267a;
                }
            } else if (Intrinsics.areEqual((Object) value, (Object) C18579k.f47426a)) {
                Object w2 = mo53551w(cVar);
                if (w2 == C11063b.m42612h()) {
                    return w2;
                }
                return C11079d2.f28267a;
            } else if (value instanceof C18572f) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53548t(androidx.datastore.core.SingleProcessDataStore.C18560b.C18562b<T> r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = (androidx.datastore.core.SingleProcessDataStore$handleUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = new androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.x r9 = (kotlinx.coroutines.C12169x) r9
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.x r9 = (kotlinx.coroutines.C12169x) r9
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore$b$b r4 = (androidx.datastore.core.SingleProcessDataStore.C18560b.C18562b) r4
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0052 }
            r10 = r9
            r9 = r4
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.x r9 = (kotlinx.coroutines.C12169x) r9
        L_0x004e:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00b8
        L_0x0052:
            r10 = move-exception
            goto L_0x00d9
        L_0x0055:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.x r10 = r9.mo53558b()
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x00d5 }
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r2 = r8.f47404h     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00d5 }
            androidx.datastore.core.j r2 = (androidx.datastore.core.C18578j) r2     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2 instanceof androidx.datastore.core.C18568b     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            kotlin.jvm.functions.p r2 = r9.mo53560d()     // Catch:{ all -> 0x00d5 }
            kotlin.coroutines.CoroutineContext r9 = r9.mo53559c()     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r10     // Catch:{ all -> 0x00d5 }
            r0.label = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r8.mo53554z(r2, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b8
        L_0x0081:
            boolean r6 = r2 instanceof androidx.datastore.core.C18574h     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            boolean r5 = r2 instanceof androidx.datastore.core.C18579k     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            if (r5 == 0) goto L_0x00c4
            androidx.datastore.core.j r5 = r9.mo53557a()     // Catch:{ all -> 0x00d5 }
            if (r2 != r5) goto L_0x00bd
            r0.L$0 = r9     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r8     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r10     // Catch:{ all -> 0x00d5 }
            r0.label = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r8.mo53550v(r0)     // Catch:{ all -> 0x00d5 }
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r8
        L_0x00a0:
            kotlin.jvm.functions.p r4 = r9.mo53560d()     // Catch:{ all -> 0x00d5 }
            kotlin.coroutines.CoroutineContext r9 = r9.mo53559c()     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r10     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r0.L$1 = r5     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r5     // Catch:{ all -> 0x00d5 }
            r0.label = r3     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r2.mo53554z(r4, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x00b8:
            java.lang.Object r10 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00e3
        L_0x00bd:
            androidx.datastore.core.h r2 = (androidx.datastore.core.C18574h) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.mo53587a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            boolean r9 = r2 instanceof androidx.datastore.core.C18572f     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00cf
            androidx.datastore.core.f r2 = (androidx.datastore.core.C18572f) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.mo53586a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00d5 }
            r9.<init>()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00d9:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
        L_0x00e3:
            kotlinx.coroutines.C12179z.m48762d(r9, r10)
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53548t(androidx.datastore.core.SingleProcessDataStore$b$b, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0116 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53549u(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.L$3
            kotlinx.coroutines.sync.a r1 = (kotlinx.coroutines.sync.C12139a) r1
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r3 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0119
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.L$5
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.L$4
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r8 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1) r8
            java.lang.Object r9 = r0.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.sync.a r11 = (kotlinx.coroutines.sync.C12139a) r11
            java.lang.Object r12 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r12 = (androidx.datastore.core.SingleProcessDataStore) r12
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00da
        L_0x0067:
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r8 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.C12139a) r9
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00b8
        L_0x007b:
            kotlin.C11661u0.m45747n(r14)
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r14 = r13.f47404h
            java.lang.Object r14 = r14.getValue()
            androidx.datastore.core.k r2 = androidx.datastore.core.C18579k.f47426a
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r2)
            if (r14 != 0) goto L_0x0099
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r14 = r13.f47404h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof androidx.datastore.core.C18574h
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = r5
            goto L_0x009a
        L_0x0099:
            r14 = r6
        L_0x009a:
            if (r14 == 0) goto L_0x0138
            kotlinx.coroutines.sync.a r9 = kotlinx.coroutines.sync.MutexKt.m48606b(r5, r6, r7)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0.L$0 = r13
            r0.L$1 = r9
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r6
            java.lang.Object r14 = r13.mo53553y(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.element = r14
            kotlin.jvm.internal.Ref$BooleanRef r14 = new kotlin.jvm.internal.Ref$BooleanRef
            r14.<init>()
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r2 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends kotlin.jvm.functions.p<? super androidx.datastore.core.g<T>, ? super kotlin.coroutines.c<? super kotlin.d2>, ? extends java.lang.Object>> r11 = r10.f47405i
            if (r11 != 0) goto L_0x00ce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto L_0x0100
        L_0x00ce:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00da:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00fb
            java.lang.Object r14 = r2.next()
            kotlin.jvm.functions.p r14 = (kotlin.jvm.functions.C11304p) r14
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r9
            r0.L$4 = r8
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00da
            return r1
        L_0x00fb:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        L_0x0100:
            r0.f47405i = r7
            r14.L$0 = r0
            r14.L$1 = r8
            r14.L$2 = r9
            r14.L$3 = r1
            r14.L$4 = r7
            r14.L$5 = r7
            r14.label = r3
            java.lang.Object r14 = r1.mo24739f(r7, r14)
            if (r14 != r2) goto L_0x0117
            return r2
        L_0x0117:
            r3 = r8
            r2 = r9
        L_0x0119:
            r2.element = r6     // Catch:{ all -> 0x0133 }
            kotlin.d2 r14 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0133 }
            r1.mo24740g(r7)
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r0 = r0.f47404h
            androidx.datastore.core.b r1 = new androidx.datastore.core.b
            T r2 = r3.element
            if (r2 == 0) goto L_0x012c
            int r5 = r2.hashCode()
        L_0x012c:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L_0x0133:
            r14 = move-exception
            r1.mo24740g(r7)
            throw r14
        L_0x0138:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53549u(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53550v(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.mo53549u(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r0 = r0.f47404h
            androidx.datastore.core.h r1 = new androidx.datastore.core.h
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53550v(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53551w(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x0045 }
            r0.label = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.mo53549u(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r0 = r0.f47404h
            androidx.datastore.core.h r1 = new androidx.datastore.core.h
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53551w(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
        return r0.f47398b.getDefaultValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:23:0x005f, B:29:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53552x(kotlin.coroutines.C11045c<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$1
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x005f
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006d }
            java.io.File r6 = r5.mo53546r()     // Catch:{ FileNotFoundException -> 0x006d }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006d }
            androidx.datastore.core.i<T> r6 = r5.f47398b     // Catch:{ all -> 0x0065 }
            r0.L$0 = r5     // Catch:{ all -> 0x0065 }
            r0.L$1 = r2     // Catch:{ all -> 0x0065 }
            r4 = 0
            r0.L$2 = r4     // Catch:{ all -> 0x0065 }
            r0.label = r3     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = r6.mo31157b(r2, r0)     // Catch:{ all -> 0x0065 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r5
            r1 = r4
        L_0x005f:
            kotlin.p010io.C11133b.m42950a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0063 }
            return r6
        L_0x0063:
            r6 = move-exception
            goto L_0x006f
        L_0x0065:
            r6 = move-exception
            r0 = r5
        L_0x0067:
            throw r6     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0063 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0063 }
        L_0x006d:
            r6 = move-exception
            r0 = r5
        L_0x006f:
            java.io.File r1 = r0.mo53546r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0080
            androidx.datastore.core.i<T> r6 = r0.f47398b
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L_0x0080:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53552x(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53553y(kotlin.coroutines.C11045c<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.C11661u0.m45747n(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ CorruptionException -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r7     // Catch:{ CorruptionException -> 0x0064 }
            r0.label = r5     // Catch:{ CorruptionException -> 0x0064 }
            java.lang.Object r8 = r7.mo53552x(r0)     // Catch:{ CorruptionException -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            androidx.datastore.core.a<T> r5 = r2.f47399c
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r4 = r5.mo53575a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.L$0 = r2     // Catch:{ IOException -> 0x0088 }
            r0.L$1 = r8     // Catch:{ IOException -> 0x0088 }
            r0.label = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.mo53542A(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            kotlin.C11414o.m43942a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53553y(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo53554z(kotlin.jvm.functions.C11304p<? super T, ? super kotlin.coroutines.C11045c<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.C11045c<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.L$1
            java.lang.Object r9 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.L$2
            java.lang.Object r9 = r0.L$1
            androidx.datastore.core.b r9 = (androidx.datastore.core.C18568b) r9
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0073
        L_0x0049:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r10 = r7.f47404h
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.b r10 = (androidx.datastore.core.C18568b) r10
            r10.mo53576a()
            java.lang.Object r2 = r10.mo53578c()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r8, r2, r3)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.C11965h.m47673h(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.mo53576a()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r8 = r2.mo53542A(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r9 = r9.f47404h
            androidx.datastore.core.b r10 = new androidx.datastore.core.b
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.mo53554z(kotlin.jvm.functions.p, kotlin.coroutines.CoroutineContext, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SingleProcessDataStore(kotlin.jvm.functions.C11289a r7, androidx.datastore.core.C18577i r8, java.util.List r9, androidx.datastore.core.C18567a r10, kotlinx.coroutines.C12074o0 r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L_0x0008
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0008:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0012
            androidx.datastore.core.handlers.a r10 = new androidx.datastore.core.handlers.a
            r10.<init>()
        L_0x0012:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L_0x002b
            kotlinx.coroutines.d1 r9 = kotlinx.coroutines.C11768d1.f29186a
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.C11768d1.m46781c()
            r10 = 1
            r11 = 0
            kotlinx.coroutines.a0 r10 = kotlinx.coroutines.C11719b3.m46155c(r11, r10, r11)
            kotlin.coroutines.CoroutineContext r9 = r9.mo7443Q(r10)
            kotlinx.coroutines.o0 r11 = kotlinx.coroutines.C12079p0.m48260a(r9)
        L_0x002b:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.<init>(kotlin.jvm.functions.a, androidx.datastore.core.i, java.util.List, androidx.datastore.core.a, kotlinx.coroutines.o0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
