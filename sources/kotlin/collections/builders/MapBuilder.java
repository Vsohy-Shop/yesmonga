package kotlin.collections.builders;

import com.google.firebase.installations.local.C33093b;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.collections.C10953k0;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.jvm.internal.markers.C11351g;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u000e\b\u0000\u0018\u0000 z*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006z{|}~BG\b\u0002\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010T\u001a\u00020\b\u0012\u0006\u0010U\u001a\u00020\b¢\u0006\u0004\bv\u0010wB\t\b\u0016¢\u0006\u0004\bv\u0010<B\u0011\b\u0016\u0012\u0006\u0010x\u001a\u00020\b¢\u0006\u0004\bv\u0010yJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\bH\u0002J\u0018\u0010$\u001a\u00020\r2\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"H\u0002J\u001c\u0010'\u001a\u00020\r2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0002J\"\u0010*\u001a\u00020\r2\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0(H\u0002J\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"J\b\u0010,\u001a\u00020\rH\u0016J\u0017\u0010-\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u0010.J\u001a\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u00101J!\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\u00020\n2\u0014\u0010)\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0016J\u0019\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u00020\nH\u0016J\u0013\u00107\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00108\u001a\u00020\bH\u0016J\b\u0010:\u001a\u000209H\u0016J\u000f\u0010;\u001a\u00020\nH\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0000¢\u0006\u0004\b=\u0010\u0016J\u0017\u0010>\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0000¢\u0006\u0004\b>\u0010\u0016J#\u0010?\u001a\u00020\r2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0000¢\u0006\u0004\b?\u0010@J\u001b\u0010\t\u001a\u00020\r2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030(H\u0000¢\u0006\u0004\b\t\u0010AJ#\u0010\u0001\u001a\u00020\r2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0000¢\u0006\u0004\b\u0001\u0010@J\u0017\u0010C\u001a\u00020\r2\u0006\u0010B\u001a\u00028\u0001H\u0000¢\u0006\u0004\bC\u0010.J\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0000¢\u0006\u0004\bK\u0010LR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010\u001aR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010\u001aR\u0016\u0010V\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010\u001aR$\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020\b8\u0016@RX\u000e¢\u0006\f\n\u0004\bX\u0010\u001a\u001a\u0004\bY\u0010ZR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR$\u0010d\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r8\u0000@BX\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bh\u0010ZR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000j8VX\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00010n8VX\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR&\u0010t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010r0j8VX\u0004¢\u0006\u0006\u001a\u0004\bs\u0010lR\u0014\u0010\u000f\u001a\u00020\b8@X\u0004¢\u0006\u0006\u001a\u0004\bu\u0010Z¨\u0006\u0001"}, mo22516d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "n", "Lkotlin/d2;", "r", "extraCapacity", "", "P", "capacity", "q", "", "i", "()[Ljava/lang/Object;", "key", "C", "(Ljava/lang/Object;)I", "m", "newHashSize", "J", "I", "t", "value", "u", "index", "N", "removedHash", "L", "", "other", "p", "", "entry", "H", "", "from", "G", "j", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "equals", "hashCode", "", "toString", "l", "()V", "h", "M", "o", "(Ljava/util/Map$Entry;)Z", "(Ljava/util/Collection;)Z", "element", "O", "Lkotlin/collections/builders/MapBuilder$e;", "F", "()Lkotlin/collections/builders/MapBuilder$e;", "Lkotlin/collections/builders/MapBuilder$f;", "Q", "()Lkotlin/collections/builders/MapBuilder$f;", "Lkotlin/collections/builders/MapBuilder$b;", "s", "()Lkotlin/collections/builders/MapBuilder$b;", "keysArray", "[Ljava/lang/Object;", "valuesArray", "", "presenceArray", "[I", "hashArray", "maxProbeDistance", "length", "hashShift", "<set-?>", "size", "z", "()I", "Lkotlin/collections/builders/d;", "keysView", "Lkotlin/collections/builders/d;", "Lkotlin/collections/builders/e;", "valuesView", "Lkotlin/collections/builders/e;", "Lkotlin/collections/builders/c;", "entriesView", "Lkotlin/collections/builders/c;", "isReadOnly", "Z", "E", "()Z", "x", "hashSize", "", "y", "()Ljava/util/Set;", "keys", "", "B", "()Ljava/util/Collection;", "values", "", "w", "entries", "v", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, C11351g {
    @C12579k

    /* renamed from: a */
    public static final C10912a f28149a = new C10912a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f28150b = -1640531527;

    /* renamed from: c */
    public static final int f28151c = 8;

    /* renamed from: d */
    public static final int f28152d = 2;

    /* renamed from: e */
    public static final int f28153e = -1;
    @C12580l
    private C10922c<K, V> entriesView;
    @C12579k
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    @C12579k
    public K[] keysArray;
    @C12580l
    private C10923d<K> keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    @C12579k
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    @C12580l
    public V[] valuesArray;
    @C12580l
    private C10924e<V> valuesView;

    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    public static final class C10912a {
        public /* synthetic */ C10912a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final int mo22174c(int i) {
            return Integer.highestOneBit(C11479u.m44447u(i, 1) * 3);
        }

        /* renamed from: d */
        public final int mo22175d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public C10912a() {
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C10913b<K, V> extends C10915d<K, V> implements Iterator<Map.Entry<K, V>>, C11348d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10913b(@C12579k MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            Intrinsics.checkNotNullParameter(mapBuilder, "map");
        }

        @C12579k
        /* renamed from: j */
        public C10914c<K, V> next() {
            if (mo22186b() < mo22188d().length) {
                int b = mo22186b();
                mo22190f(b + 1);
                mo22191h(b);
                C10914c<K, V> cVar = new C10914c<>(mo22188d(), mo22187c());
                mo22189e();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final void mo22177l(@C12579k StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (mo22186b() < mo22188d().length) {
                int b = mo22186b();
                mo22190f(b + 1);
                mo22191h(b);
                Object obj = mo22188d().keysArray[mo22187c()];
                if (Intrinsics.areEqual(obj, (Object) mo22188d())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] e = mo22188d().valuesArray;
                Intrinsics.checkNotNull(e);
                Object obj2 = e[mo22187c()];
                if (Intrinsics.areEqual(obj2, (Object) mo22188d())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo22189e();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: m */
        public final int mo22178m() {
            int i;
            if (mo22186b() < mo22188d().length) {
                int b = mo22186b();
                mo22190f(b + 1);
                mo22191h(b);
                Object obj = mo22188d().keysArray[mo22187c()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] e = mo22188d().valuesArray;
                Intrinsics.checkNotNull(e);
                Object obj2 = e[mo22187c()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                mo22189e();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C10914c<K, V> implements Map.Entry<K, V>, C11351g.C11352a {
        @C12579k

        /* renamed from: a */
        public final MapBuilder<K, V> f28154a;

        /* renamed from: b */
        public final int f28155b;

        public C10914c(@C12579k MapBuilder<K, V> mapBuilder, int i) {
            Intrinsics.checkNotNullParameter(mapBuilder, "map");
            this.f28154a = mapBuilder;
            this.f28155b = i;
        }

        public boolean equals(@C12580l Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!Intrinsics.areEqual(entry.getKey(), getKey()) || !Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public K getKey() {
            return this.f28154a.keysArray[this.f28155b];
        }

        public V getValue() {
            V[] e = this.f28154a.valuesArray;
            Intrinsics.checkNotNull(e);
            return e[this.f28155b];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.f28154a.mo22153l();
            V[] a = this.f28154a.mo22149i();
            int i = this.f28155b;
            V v2 = a[i];
            a[i] = v;
            return v2;
        }

        @C12579k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @C11363r0({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,694:1\n1#2:695\n*E\n"})
    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C10915d<K, V> {
        @C12579k

        /* renamed from: a */
        public final MapBuilder<K, V> f28156a;

        /* renamed from: b */
        public int f28157b;

        /* renamed from: c */
        public int f28158c = -1;

        public C10915d(@C12579k MapBuilder<K, V> mapBuilder) {
            Intrinsics.checkNotNullParameter(mapBuilder, "map");
            this.f28156a = mapBuilder;
            mo22189e();
        }

        /* renamed from: b */
        public final int mo22186b() {
            return this.f28157b;
        }

        /* renamed from: c */
        public final int mo22187c() {
            return this.f28158c;
        }

        @C12579k
        /* renamed from: d */
        public final MapBuilder<K, V> mo22188d() {
            return this.f28156a;
        }

        /* renamed from: e */
        public final void mo22189e() {
            while (this.f28157b < this.f28156a.length) {
                int[] d = this.f28156a.presenceArray;
                int i = this.f28157b;
                if (d[i] < 0) {
                    this.f28157b = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public final void mo22190f(int i) {
            this.f28157b = i;
        }

        /* renamed from: h */
        public final void mo22191h(int i) {
            this.f28158c = i;
        }

        public final boolean hasNext() {
            return this.f28157b < this.f28156a.length;
        }

        public final void remove() {
            boolean z;
            if (this.f28158c != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f28156a.mo22153l();
                this.f28156a.mo22137N(this.f28158c);
                this.f28158c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C10916e<K, V> extends C10915d<K, V> implements Iterator<K>, C11348d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10916e(@C12579k MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            Intrinsics.checkNotNullParameter(mapBuilder, "map");
        }

        public K next() {
            if (mo22186b() < mo22188d().length) {
                int b = mo22186b();
                mo22190f(b + 1);
                mo22191h(b);
                K k = mo22188d().keysArray[mo22187c()];
                mo22189e();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C10917f<K, V> extends C10915d<K, V> implements Iterator<V>, C11348d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10917f(@C12579k MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            Intrinsics.checkNotNullParameter(mapBuilder, "map");
        }

        public V next() {
            if (mo22186b() < mo22188d().length) {
                int b = mo22186b();
                mo22190f(b + 1);
                mo22191h(b);
                V[] e = mo22188d().valuesArray;
                Intrinsics.checkNotNull(e);
                V v = e[mo22187c()];
                mo22189e();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = f28149a.mo22175d(mo22171x());
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @C12579k
    /* renamed from: B */
    public Collection<V> mo22126B() {
        C10924e<V> eVar = this.valuesView;
        if (eVar != null) {
            return eVar;
        }
        C10924e<V> eVar2 = new C10924e<>(this);
        this.valuesView = eVar2;
        return eVar2;
    }

    /* renamed from: C */
    public final int mo22127C(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.hashShift;
    }

    /* renamed from: E */
    public final boolean mo22128E() {
        return this.isReadOnly;
    }

    @C12579k
    /* renamed from: F */
    public final C10916e<K, V> mo22129F() {
        return new C10916e<>(this);
    }

    /* renamed from: G */
    public final boolean mo22130G(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        mo22161r(collection.size());
        for (Map.Entry H : collection) {
            if (mo22131H(H)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: H */
    public final boolean mo22131H(Map.Entry<? extends K, ? extends V> entry) {
        int h = mo22147h(entry.getKey());
        Object[] i = mo22149i();
        if (h >= 0) {
            i[h] = entry.getValue();
            return true;
        }
        int i2 = (-h) - 1;
        if (Intrinsics.areEqual((Object) entry.getValue(), i[i2])) {
            return false;
        }
        i[i2] = entry.getValue();
        return true;
    }

    /* renamed from: I */
    public final boolean mo22132I(int i) {
        int C = mo22127C(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[C] == 0) {
                iArr[C] = i + 1;
                this.presenceArray[i] = C;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = C - 1;
            if (C == 0) {
                C = mo22171x() - 1;
            } else {
                C = i3;
            }
        }
    }

    /* renamed from: J */
    public final void mo22133J(int i) {
        if (this.length > size()) {
            mo22154m();
        }
        int i2 = 0;
        if (i != mo22171x()) {
            this.hashArray = new int[i];
            this.hashShift = f28149a.mo22175d(i);
        } else {
            C10956m.m41238l2(this.hashArray, 0, 0, mo22171x());
        }
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (mo22132I(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: K */
    public final boolean mo22134K(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, C33541p.f81644a);
        mo22153l();
        int t = mo22165t(entry.getKey());
        if (t < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.areEqual((Object) vArr[t], (Object) entry.getValue())) {
            return false;
        }
        mo22137N(t);
        return true;
    }

    /* renamed from: L */
    public final void mo22135L(int i) {
        int B = C11479u.m44313B(this.maxProbeDistance * 2, mo22171x() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            int i4 = i - 1;
            if (i == 0) {
                i = mo22171x() - 1;
            } else {
                i = i4;
            }
            i2++;
            if (i2 > this.maxProbeDistance) {
                this.hashArray[i3] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i3] = -1;
            } else {
                int i6 = i5 - 1;
                if (((mo22127C(this.keysArray[i6]) - i) & (mo22171x() - 1)) >= i2) {
                    this.hashArray[i3] = i5;
                    this.presenceArray[i6] = i3;
                }
                B--;
            }
            i3 = i;
            i2 = 0;
            B--;
        } while (B >= 0);
        this.hashArray[i3] = -1;
    }

    /* renamed from: M */
    public final int mo22136M(K k) {
        mo22153l();
        int t = mo22165t(k);
        if (t < 0) {
            return -1;
        }
        mo22137N(t);
        return t;
    }

    /* renamed from: N */
    public final void mo22137N(int i) {
        C10921b.m40862f(this.keysArray, i);
        mo22135L(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
    }

    /* renamed from: O */
    public final boolean mo22138O(V v) {
        mo22153l();
        int u = mo22167u(v);
        if (u < 0) {
            return false;
        }
        mo22137N(u);
        return true;
    }

    /* renamed from: P */
    public final boolean mo22139P(int i) {
        int v = mo22168v();
        int i2 = this.length;
        int i3 = v - i2;
        int size2 = i2 - size();
        if (i3 >= i || i3 + size2 < i || size2 < mo22168v() / 4) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: Q */
    public final C10917f<K, V> mo22140Q() {
        return new C10917f<>(this);
    }

    public void clear() {
        mo22153l();
        C10953k0 H = new C11466l(0, this.length - 1).iterator();
        while (H.hasNext()) {
            int c = H.mo6374c();
            int[] iArr = this.presenceArray;
            int i = iArr[c];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[c] = -1;
            }
        }
        C10921b.m40863g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C10921b.m40863g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public boolean containsKey(Object obj) {
        return mo22165t(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo22167u(obj) >= 0;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo22170w();
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == this || ((obj instanceof Map) && mo22157p((Map) obj))) {
            return true;
        }
        return false;
    }

    @C12580l
    public V get(Object obj) {
        int t = mo22165t(obj);
        if (t < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[t];
    }

    /* renamed from: h */
    public final int mo22147h(K k) {
        mo22153l();
        while (true) {
            int C = mo22127C(k);
            int B = C11479u.m44313B(this.maxProbeDistance * 2, mo22171x() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[C];
                if (i2 <= 0) {
                    if (this.length >= mo22168v()) {
                        mo22161r(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = k;
                        this.presenceArray[i3] = C;
                        this.hashArray[C] = i4;
                        this.size = size() + 1;
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else if (Intrinsics.areEqual((Object) this.keysArray[i2 - 1], (Object) k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > B) {
                        mo22133J(mo22171x() * 2);
                        break;
                    }
                    int i5 = C - 1;
                    if (C == 0) {
                        C = mo22171x() - 1;
                    } else {
                        C = i5;
                    }
                }
            }
        }
    }

    public int hashCode() {
        C10913b s = mo22163s();
        int i = 0;
        while (s.hasNext()) {
            i += s.mo22178m();
        }
        return i;
    }

    /* renamed from: i */
    public final V[] mo22149i() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] d = C10921b.m40860d(mo22168v());
        this.valuesArray = d;
        return d;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @C12579k
    /* renamed from: j */
    public final Map<K, V> mo22151j() {
        mo22153l();
        this.isReadOnly = true;
        return this;
    }

    public final /* bridge */ Set<K> keySet() {
        return mo22172y();
    }

    /* renamed from: l */
    public final void mo22153l() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: m */
    public final void mo22154m() {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            if (this.presenceArray[i2] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C10921b.m40863g(this.keysArray, i3, i);
        if (vArr != null) {
            C10921b.m40863g(vArr, i3, this.length);
        }
        this.length = i3;
    }

    /* renamed from: n */
    public final boolean mo22155n(@C12579k Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo22156o((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo22156o(@C12579k Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, C33541p.f81644a);
        int t = mo22165t(entry.getKey());
        if (t < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.areEqual((Object) vArr[t], (Object) entry.getValue());
    }

    /* renamed from: p */
    public final boolean mo22157p(Map<?, ?> map) {
        return size() == map.size() && mo22155n(map.entrySet());
    }

    @C12580l
    public V put(K k, V v) {
        mo22153l();
        int h = mo22147h(k);
        V[] i = mo22149i();
        if (h < 0) {
            int i2 = (-h) - 1;
            V v2 = i[i2];
            i[i2] = v;
            return v2;
        }
        i[h] = v;
        return null;
    }

    public void putAll(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "from");
        mo22153l();
        mo22130G(map.entrySet());
    }

    /* renamed from: q */
    public final void mo22160q(int i) {
        V[] vArr;
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > mo22168v()) {
            int v = (mo22168v() * 3) / 2;
            if (i <= v) {
                i = v;
            }
            this.keysArray = C10921b.m40861e(this.keysArray, i);
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = C10921b.m40861e(vArr2, i);
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            int[] copyOf = Arrays.copyOf(this.presenceArray, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.presenceArray = copyOf;
            int a = f28149a.mo22174c(i);
            if (a > mo22171x()) {
                mo22133J(a);
            }
        }
    }

    /* renamed from: r */
    public final void mo22161r(int i) {
        if (mo22139P(i)) {
            mo22133J(mo22171x());
        } else {
            mo22160q(this.length + i);
        }
    }

    @C12580l
    public V remove(Object obj) {
        int M = mo22136M(obj);
        if (M < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v = vArr[M];
        C10921b.m40862f(vArr, M);
        return v;
    }

    @C12579k
    /* renamed from: s */
    public final C10913b<K, V> mo22163s() {
        return new C10913b<>(this);
    }

    public final /* bridge */ int size() {
        return mo22173z();
    }

    /* renamed from: t */
    public final int mo22165t(K k) {
        int C = mo22127C(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[C];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual((Object) this.keysArray[i3], (Object) k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = C - 1;
            if (C == 0) {
                C = mo22171x() - 1;
            } else {
                C = i4;
            }
        }
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append(C33093b.f80281i);
        C10913b s = mo22163s();
        int i = 0;
        while (s.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            s.mo22177l(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final int mo22167u(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.areEqual((Object) vArr[i], (Object) v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: v */
    public final int mo22168v() {
        return this.keysArray.length;
    }

    public final /* bridge */ Collection<V> values() {
        return mo22126B();
    }

    @C12579k
    /* renamed from: w */
    public Set<Map.Entry<K, V>> mo22170w() {
        C10922c<K, V> cVar = this.entriesView;
        if (cVar != null) {
            return cVar;
        }
        C10922c<K, V> cVar2 = new C10922c<>(this);
        this.entriesView = cVar2;
        return cVar2;
    }

    /* renamed from: x */
    public final int mo22171x() {
        return this.hashArray.length;
    }

    @C12579k
    /* renamed from: y */
    public Set<K> mo22172y() {
        C10923d<K> dVar = this.keysView;
        if (dVar != null) {
            return dVar;
        }
        C10923d<K> dVar2 = new C10923d<>(this);
        this.keysView = dVar2;
        return dVar2;
    }

    /* renamed from: z */
    public int mo22173z() {
        return this.size;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(C10921b.m40860d(i), (V[]) null, new int[i], new int[f28149a.mo22174c(i)], 2, 0);
    }
}
