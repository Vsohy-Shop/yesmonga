package com.google.gson.internal;

import com.contentsquare.android.api.C14092c;
import com.google.gson.C33611b;
import com.google.gson.C33612c;
import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33609d;
import com.google.gson.annotations.C33610e;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements C33714t, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private List<C33611b> deserializationStrategies = Collections.emptyList();
    private int modifiers = C14092c.f34527J;
    private boolean requireExpose;
    private List<C33611b> serializationStrategies = Collections.emptyList();
    private boolean serializeInnerClasses = true;
    private double version = IGNORE_VERSIONS;

    private boolean excludeClassChecks(Class<?> cls) {
        if (this.version != IGNORE_VERSIONS && !isValidVersion((C33609d) cls.getAnnotation(C33609d.class), (C33610e) cls.getAnnotation(C33610e.class))) {
            return true;
        }
        if ((this.serializeInnerClasses || !isInnerClass(cls)) && !isAnonymousOrLocal(cls)) {
            return false;
        }
        return true;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z) {
        List<C33611b> list;
        if (z) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        for (C33611b b : list) {
            if (b.mo97452b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrLocal(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    private boolean isInnerClass(Class<?> cls) {
        return cls.isMemberClass() && !isStatic(cls);
    }

    private boolean isStatic(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean isValidSince(C33609d dVar) {
        if (dVar == null || dVar.value() <= this.version) {
            return true;
        }
        return false;
    }

    private boolean isValidUntil(C33610e eVar) {
        if (eVar == null || eVar.value() > this.version) {
            return true;
        }
        return false;
    }

    private boolean isValidVersion(C33609d dVar, C33610e eVar) {
        return isValidSince(dVar) && isValidUntil(eVar);
    }

    public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
        final boolean z;
        final boolean z2;
        Class<? super T> rawType = aVar.getRawType();
        boolean excludeClassChecks = excludeClassChecks(rawType);
        if (excludeClassChecks || excludeClassInStrategy(rawType, true)) {
            z = true;
        } else {
            z = false;
        }
        if (excludeClassChecks || excludeClassInStrategy(rawType, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return null;
        }
        final C33614e eVar2 = eVar;
        final C33707a<T> aVar2 = aVar;
        return new C33708s<T>() {
            private C33708s<T> delegate;

            private C33708s<T> delegate() {
                C33708s<T> sVar = this.delegate;
                if (sVar != null) {
                    return sVar;
                }
                C33708s<T> r = eVar2.mo97483r(Excluder.this, aVar2);
                this.delegate = r;
                return r;
            }

            public T read(C33710a aVar) throws IOException {
                if (!z2) {
                    return delegate().read(aVar);
                }
                aVar.skipValue();
                return null;
            }

            public void write(C33713c cVar, T t) throws IOException {
                if (z) {
                    cVar.nullValue();
                } else {
                    delegate().write(cVar, t);
                }
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder clone = clone();
        clone.serializeInnerClasses = false;
        return clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        if (excludeClassChecks(cls) || excludeClassInStrategy(cls, z)) {
            return true;
        }
        return false;
    }

    public boolean excludeField(Field field, boolean z) {
        List<C33611b> list;
        C33606a aVar;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((C33609d) field.getAnnotation(C33609d.class), (C33610e) field.getAnnotation(C33610e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((aVar = (C33606a) field.getAnnotation(C33606a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrLocal(field.getType())) {
            return true;
        }
        if (z) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        if (list.isEmpty()) {
            return false;
        }
        C33612c cVar = new C33612c(field);
        for (C33611b a : list) {
            if (a.mo97451a(cVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder clone = clone();
        clone.requireExpose = true;
        return clone;
    }

    public Excluder withExclusionStrategy(C33611b bVar, boolean z, boolean z2) {
        Excluder clone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            clone.serializationStrategies = arrayList;
            arrayList.add(bVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            clone.deserializationStrategies = arrayList2;
            arrayList2.add(bVar);
        }
        return clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder clone = clone();
        clone.modifiers = 0;
        for (int i : iArr) {
            clone.modifiers = i | clone.modifiers;
        }
        return clone;
    }

    public Excluder withVersion(double d) {
        Excluder clone = clone();
        clone.version = d;
        return clone;
    }

    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
