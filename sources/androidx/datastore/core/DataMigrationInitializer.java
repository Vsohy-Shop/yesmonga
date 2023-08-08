package androidx.datastore.core;

import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class DataMigrationInitializer<T> {
    @C12579k

    /* renamed from: a */
    public static final Companion f47389a = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: b */
        public final <T> C11304p<C18573g<T>, C11045c<? super C11079d2>, Object> mo53534b(@C12579k List<? extends C18569c<T>> list) {
            Intrinsics.checkNotNullParameter(list, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(list, (C11045c<? super DataMigrationInitializer$Companion$getInitializer$1>) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object mo53535c(java.util.List<? extends androidx.datastore.core.C18569c<T>> r7, androidx.datastore.core.C18573g<T> r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.L$1
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.L$0
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x006b
            L_0x0034:
                r9 = move-exception
                goto L_0x0084
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.L$0
                java.util.List r7 = (java.util.List) r7
                kotlin.C11661u0.m45747n(r9)
                goto L_0x0060
            L_0x0046:
                kotlin.C11661u0.m45747n(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.L$0 = r9
                r0.label = r4
                java.lang.Object r7 = r8.mo53573a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x006b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0096
                java.lang.Object r9 = r7.next()
                kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
                r0.L$0 = r8     // Catch:{ all -> 0x0034 }
                r0.L$1 = r7     // Catch:{ all -> 0x0034 }
                r0.label = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x006b
                return r1
            L_0x0084:
                T r2 = r8.element
                if (r2 != 0) goto L_0x008b
                r8.element = r9
                goto L_0x006b
            L_0x008b:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                T r2 = r8.element
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.C11414o.m43942a(r2, r9)
                goto L_0x006b
            L_0x0096:
                T r7 = r8.element
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009f
                kotlin.d2 r7 = kotlin.C11079d2.f28267a
                return r7
            L_0x009f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.mo53535c(java.util.List, androidx.datastore.core.g, kotlin.coroutines.c):java.lang.Object");
        }

        public Companion() {
        }
    }
}
