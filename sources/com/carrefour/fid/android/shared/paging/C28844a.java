package com.carrefour.fid.android.shared.paging;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.paging.a */
public abstract class C28844a<Key, Value> {

    /* renamed from: a */
    public static final int f70655a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.paging.a$a */
    public static abstract class C28845a<Key> {

        /* renamed from: b */
        public static final int f70656b = 0;

        /* renamed from: a */
        public final int f70657a;

        @C8567o(parameters = 1)
        /* renamed from: com.carrefour.fid.android.shared.paging.a$a$a */
        public static final class C28846a<Key> extends C28845a<Key> {

            /* renamed from: d */
            public static final int f70658d = 0;
            @C12579k

            /* renamed from: c */
            public final Key f70659c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28846a(@C12579k Key key, int i) {
                super(i, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f70659c = key;
            }

            @C12579k
            /* renamed from: a */
            public Key mo83939a() {
                return this.f70659c;
            }
        }

        public /* synthetic */ C28845a(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        @C12580l
        /* renamed from: a */
        public abstract Key mo83939a();

        /* renamed from: b */
        public final int mo83940b() {
            return this.f70657a;
        }

        public C28845a(int i) {
            this.f70657a = i;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.paging.a$b */
    public static abstract class C28847b<Key, Value> {

        /* renamed from: a */
        public static final int f70660a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.shared.paging.a$b$a */
        public static final class C28848a<Key, Value> extends C28847b<Key, Value> {

            /* renamed from: c */
            public static final int f70661c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f70662b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28848a(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f70662b = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C28848a m119308c(C28848a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f70662b;
                }
                return aVar.mo83942b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo83941a() {
                return this.f70662b;
            }

            @C12579k
            /* renamed from: b */
            public final C28848a<Key, Value> mo83942b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C28848a<>(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo83943d() {
                return this.f70662b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28848a) && Intrinsics.areEqual((Object) this.f70662b, (Object) ((C28848a) obj).f70662b);
            }

            public int hashCode() {
                return this.f70662b.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f70662b;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.shared.paging.a$b$b */
        public static final class C28849b<Key, Value> extends C28847b<Key, Value> {

            /* renamed from: g */
            public static final int f70663g = 8;
            @C12579k

            /* renamed from: b */
            public final List<Value> f70664b;
            @C12580l

            /* renamed from: c */
            public final Key f70665c;
            @C12580l

            /* renamed from: d */
            public final Key f70666d;
            @C12580l

            /* renamed from: e */
            public final Integer f70667e;
            @C12580l

            /* renamed from: f */
            public final Integer f70668f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28849b(@C12579k List<? extends Value> list, @C12580l Key key, @C12580l Key key2, @C12580l Integer num, @C12580l Integer num2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(list, "data");
                this.f70664b = list;
                this.f70665c = key;
                this.f70666d = key2;
                this.f70667e = num;
                this.f70668f = num2;
            }

            /* renamed from: g */
            public static /* synthetic */ C28849b m119312g(C28849b bVar, List<Value> list, Key key, Key key2, Integer num, Integer num2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = bVar.f70664b;
                }
                if ((i & 2) != 0) {
                    key = bVar.f70665c;
                }
                Key key3 = key;
                if ((i & 4) != 0) {
                    key2 = bVar.f70666d;
                }
                Key key4 = key2;
                if ((i & 8) != 0) {
                    num = bVar.f70667e;
                }
                Integer num3 = num;
                if ((i & 16) != 0) {
                    num2 = bVar.f70668f;
                }
                return bVar.mo83953f(list, key3, key4, num3, num2);
            }

            @C12579k
            /* renamed from: a */
            public final List<Value> mo83947a() {
                return this.f70664b;
            }

            @C12580l
            /* renamed from: b */
            public final Key mo83948b() {
                return this.f70665c;
            }

            @C12580l
            /* renamed from: c */
            public final Key mo83949c() {
                return this.f70666d;
            }

            @C12580l
            /* renamed from: d */
            public final Integer mo83950d() {
                return this.f70667e;
            }

            @C12580l
            /* renamed from: e */
            public final Integer mo83951e() {
                return this.f70668f;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28849b)) {
                    return false;
                }
                C28849b bVar = (C28849b) obj;
                return Intrinsics.areEqual((Object) this.f70664b, (Object) bVar.f70664b) && Intrinsics.areEqual((Object) this.f70665c, (Object) bVar.f70665c) && Intrinsics.areEqual((Object) this.f70666d, (Object) bVar.f70666d) && Intrinsics.areEqual((Object) this.f70667e, (Object) bVar.f70667e) && Intrinsics.areEqual((Object) this.f70668f, (Object) bVar.f70668f);
            }

            @C12579k
            /* renamed from: f */
            public final C28849b<Key, Value> mo83953f(@C12579k List<? extends Value> list, @C12580l Key key, @C12580l Key key2, @C12580l Integer num, @C12580l Integer num2) {
                Intrinsics.checkNotNullParameter(list, "data");
                return new C28849b(list, key, key2, num, num2);
            }

            @C12579k
            /* renamed from: h */
            public final List<Value> mo83954h() {
                return this.f70664b;
            }

            public int hashCode() {
                int hashCode = this.f70664b.hashCode() * 31;
                Key key = this.f70665c;
                int i = 0;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f70666d;
                int hashCode3 = (hashCode2 + (key2 == null ? 0 : key2.hashCode())) * 31;
                Integer num = this.f70667e;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f70668f;
                if (num2 != null) {
                    i = num2.hashCode();
                }
                return hashCode4 + i;
            }

            @C12580l
            /* renamed from: i */
            public final Key mo83956i() {
                return this.f70666d;
            }

            @C12580l
            /* renamed from: j */
            public final Key mo83957j() {
                return this.f70665c;
            }

            @C12580l
            /* renamed from: k */
            public final Integer mo83958k() {
                return this.f70668f;
            }

            @C12580l
            /* renamed from: l */
            public final Integer mo83959l() {
                return this.f70667e;
            }

            @C12579k
            public String toString() {
                List<Value> list = this.f70664b;
                Key key = this.f70665c;
                Key key2 = this.f70666d;
                Integer num = this.f70667e;
                Integer num2 = this.f70668f;
                return "Page(data=" + list + ", prevKey=" + key + ", nextKey=" + key2 + ", totalCount=" + num + ", topResultsCategoryId=" + num2 + ")";
            }
        }

        public /* synthetic */ C28847b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28847b() {
        }
    }

    @C12580l
    /* renamed from: a */
    public abstract Object mo80180a(@C12579k C28845a<Key> aVar, @C12579k C11045c<? super C28847b<Key, Value>> cVar);
}
