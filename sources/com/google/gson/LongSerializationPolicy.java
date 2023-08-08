package com.google.gson;

public enum LongSerializationPolicy {
    DEFAULT {
        /* renamed from: b */
        public C33699k mo97437b(Long l) {
            return new C33703o((Number) l);
        }
    },
    STRING {
        /* renamed from: b */
        public C33699k mo97437b(Long l) {
            return new C33703o(String.valueOf(l));
        }
    };

    /* renamed from: b */
    public abstract C33699k mo97437b(Long l);
}
