package com.contentsquare.android.sdk;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.aa */
public class C14179aa extends C14704sa {

    /* renamed from: f */
    public final C14218ba f35053f;

    /* renamed from: com.contentsquare.android.sdk.aa$b */
    public static class C14181b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C14179aa> f35054a;

        public C14181b(Map.Entry<K, C14179aa> entry) {
            this.f35054a = entry;
        }

        /* renamed from: a */
        public C14179aa mo34530a() {
            return this.f35054a.getValue();
        }

        public K getKey() {
            return this.f35054a.getKey();
        }

        public Object getValue() {
            C14179aa value = this.f35054a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo34527f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C14218ba) {
                return this.f35054a.getValue().mo36399e((C14218ba) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.contentsquare.android.sdk.aa$c */
    public static class C14182c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f35055a;

        public C14182c(Iterator<Map.Entry<K, Object>> it) {
            this.f35055a = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f35055a.next();
            return next.getValue() instanceof C14179aa ? new C14181b(next) : next;
        }

        public boolean hasNext() {
            return this.f35055a.hasNext();
        }

        public void remove() {
            this.f35055a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo34527f().equals(obj);
    }

    /* renamed from: f */
    public C14218ba mo34527f() {
        return mo36397c(this.f35053f);
    }

    public int hashCode() {
        return mo34527f().hashCode();
    }

    public String toString() {
        return mo34527f().toString();
    }
}
