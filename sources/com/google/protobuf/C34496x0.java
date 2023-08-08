package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.x0 */
public class C34496x0 extends C34503y0 {

    /* renamed from: f */
    public final C34412l1 f83561f;

    /* renamed from: com.google.protobuf.x0$b */
    public static class C34498b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C34496x0> f83562a;

        /* renamed from: a */
        public C34496x0 mo101667a() {
            return this.f83562a.getValue();
        }

        public K getKey() {
            return this.f83562a.getKey();
        }

        public Object getValue() {
            C34496x0 value = this.f83562a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo101665p();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C34412l1) {
                return this.f83562a.getValue().mo101703m((C34412l1) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C34498b(Map.Entry<K, C34496x0> entry) {
            this.f83562a = entry;
        }
    }

    /* renamed from: com.google.protobuf.x0$c */
    public static class C34499c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f83563a;

        public C34499c(Iterator<Map.Entry<K, Object>> it) {
            this.f83563a = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f83563a.next();
            if (next.getValue() instanceof C34496x0) {
                return new C34498b(next);
            }
            return next;
        }

        public boolean hasNext() {
            return this.f83563a.hasNext();
        }

        public void remove() {
            this.f83563a.remove();
        }
    }

    public C34496x0(C34412l1 l1Var, C34368g0 g0Var, ByteString byteString) {
        super(g0Var, byteString);
        this.f83561f = l1Var;
    }

    /* renamed from: c */
    public boolean mo101662c() {
        return super.mo101662c() || this.f83567c == this.f83561f;
    }

    public boolean equals(Object obj) {
        return mo101665p().equals(obj);
    }

    public int hashCode() {
        return mo101665p().hashCode();
    }

    /* renamed from: p */
    public C34412l1 mo101665p() {
        return mo101698g(this.f83561f);
    }

    public String toString() {
        return mo101665p().toString();
    }
}
