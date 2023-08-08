package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.annotations.C33607b;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.C33707a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C33714t {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor2) {
        this.constructorConstructor = constructorConstructor2;
    }

    public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
        C33607b bVar = (C33607b) aVar.getRawType().getAnnotation(C33607b.class);
        if (bVar == null) {
            return null;
        }
        return getTypeAdapter(this.constructorConstructor, eVar, aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.s<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.google.gson.s, com.google.gson.s<?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.C33708s<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor r9, com.google.gson.C33614e r10, com.google.gson.reflect.C33707a<?> r11, com.google.gson.annotations.C33607b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.reflect.a r0 = com.google.gson.reflect.C33707a.get(r0)
            com.google.gson.internal.ObjectConstructor r9 = r9.get(r0)
            java.lang.Object r9 = r9.construct()
            boolean r0 = r9 instanceof com.google.gson.C33708s
            if (r0 == 0) goto L_0x0017
            com.google.gson.s r9 = (com.google.gson.C33708s) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.C33714t
            if (r0 == 0) goto L_0x0022
            com.google.gson.t r9 = (com.google.gson.C33714t) r9
            com.google.gson.s r9 = r9.create(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.C33705q
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.C33698j
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.google.gson.q r0 = (com.google.gson.C33705q) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.C33698j
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.j r1 = (com.google.gson.C33698j) r1
        L_0x006b:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.s r9 = r9.nullSafe()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(com.google.gson.internal.ConstructorConstructor, com.google.gson.e, com.google.gson.reflect.a, com.google.gson.annotations.b):com.google.gson.s");
    }
}
