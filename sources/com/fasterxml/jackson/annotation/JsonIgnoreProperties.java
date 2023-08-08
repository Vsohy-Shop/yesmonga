package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIgnoreProperties {

    public static class Value implements JacksonAnnotationValue<JsonIgnoreProperties>, Serializable {
        protected static final Value EMPTY = new Value(Collections.emptySet(), false, false, false, true);
        private static final long serialVersionUID = 1;
        protected final boolean _allowGetters;
        protected final boolean _allowSetters;
        protected final boolean _ignoreUnknown;
        protected final Set<String> _ignored;
        protected final boolean _merge;

        public Value(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (set == null) {
                this._ignored = Collections.emptySet();
            } else {
                this._ignored = set;
            }
            this._ignoreUnknown = z;
            this._allowGetters = z2;
            this._allowSetters = z3;
            this._merge = z4;
        }

        private static Set<String> _asSet(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String add : strArr) {
                hashSet.add(add);
            }
            return hashSet;
        }

        private static boolean _empty(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            Value value = EMPTY;
            if (z != value._ignoreUnknown || z2 != value._allowGetters || z3 != value._allowSetters || z4 != value._merge) {
                return false;
            }
            if (set == null || set.size() == 0) {
                return true;
            }
            return false;
        }

        private static boolean _equals(Value value, Value value2) {
            if (value._ignoreUnknown == value2._ignoreUnknown && value._merge == value2._merge && value._allowGetters == value2._allowGetters && value._allowSetters == value2._allowSetters && value._ignored.equals(value2._ignored)) {
                return true;
            }
            return false;
        }

        private static Set<String> _merge(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static Value construct(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (_empty(set, z, z2, z3, z4)) {
                return EMPTY;
            }
            return new Value(set, z, z2, z3, z4);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value forIgnoreUnknown(boolean z) {
            if (z) {
                return EMPTY.withIgnoreUnknown();
            }
            return EMPTY.withoutIgnoreUnknown();
        }

        public static Value forIgnoredProperties(Set<String> set) {
            return EMPTY.withIgnored(set);
        }

        public static Value from(JsonIgnoreProperties jsonIgnoreProperties) {
            if (jsonIgnoreProperties == null) {
                return EMPTY;
            }
            return construct(_asSet(jsonIgnoreProperties.value()), jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value value2 : valueArr) {
                if (value2 != null) {
                    if (value != null) {
                        value2 = value.withOverrides(value2);
                    }
                    value = value2;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() != getClass() || !_equals(this, (Value) obj)) {
                return false;
            }
            return true;
        }

        public Set<String> findIgnoredForDeserialization() {
            if (this._allowSetters) {
                return Collections.emptySet();
            }
            return this._ignored;
        }

        public Set<String> findIgnoredForSerialization() {
            if (this._allowGetters) {
                return Collections.emptySet();
            }
            return this._ignored;
        }

        public boolean getAllowGetters() {
            return this._allowGetters;
        }

        public boolean getAllowSetters() {
            return this._allowSetters;
        }

        public boolean getIgnoreUnknown() {
            return this._ignoreUnknown;
        }

        public Set<String> getIgnored() {
            return this._ignored;
        }

        public boolean getMerge() {
            return this._merge;
        }

        public int hashCode() {
            return this._ignored.size() + (this._ignoreUnknown ? 1 : -3) + (this._allowGetters ? 3 : -7) + (this._allowSetters ? 7 : -11) + (this._merge ? 11 : -13);
        }

        public Object readResolve() {
            if (_empty(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge)) {
                return EMPTY;
            }
            return this;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", new Object[]{this._ignored, Boolean.valueOf(this._ignoreUnknown), Boolean.valueOf(this._allowGetters), Boolean.valueOf(this._allowSetters), Boolean.valueOf(this._merge)});
        }

        public Class<JsonIgnoreProperties> valueFor() {
            return JsonIgnoreProperties.class;
        }

        public Value withAllowGetters() {
            if (this._allowGetters) {
                return this;
            }
            return construct(this._ignored, this._ignoreUnknown, true, this._allowSetters, this._merge);
        }

        public Value withAllowSetters() {
            if (this._allowSetters) {
                return this;
            }
            return construct(this._ignored, this._ignoreUnknown, this._allowGetters, true, this._merge);
        }

        public Value withIgnoreUnknown() {
            if (this._ignoreUnknown) {
                return this;
            }
            return construct(this._ignored, true, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withIgnored(Set<String> set) {
            return construct(set, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withMerge() {
            if (this._merge) {
                return this;
            }
            return construct(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, true);
        }

        public Value withOverrides(Value value) {
            boolean z;
            boolean z2;
            if (value == null || value == EMPTY) {
                return this;
            }
            if (!value._merge) {
                return value;
            }
            if (_equals(this, value)) {
                return this;
            }
            Set<String> _merge2 = _merge(this._ignored, value._ignored);
            boolean z3 = false;
            if (this._ignoreUnknown || value._ignoreUnknown) {
                z = true;
            } else {
                z = false;
            }
            if (this._allowGetters || value._allowGetters) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this._allowSetters || value._allowSetters) {
                z3 = true;
            }
            return construct(_merge2, z, z2, z3, true);
        }

        public Value withoutAllowGetters() {
            if (!this._allowGetters) {
                return this;
            }
            return construct(this._ignored, this._ignoreUnknown, false, this._allowSetters, this._merge);
        }

        public Value withoutAllowSetters() {
            if (!this._allowSetters) {
                return this;
            }
            return construct(this._ignored, this._ignoreUnknown, this._allowGetters, false, this._merge);
        }

        public Value withoutIgnoreUnknown() {
            if (!this._ignoreUnknown) {
                return this;
            }
            return construct(this._ignored, false, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withoutIgnored() {
            return construct((Set<String>) null, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withoutMerge() {
            if (!this._merge) {
                return this;
            }
            return construct(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, false);
        }

        public static Value forIgnoredProperties(String... strArr) {
            if (strArr.length == 0) {
                return EMPTY;
            }
            return EMPTY.withIgnored(_asSet(strArr));
        }

        public Value withIgnored(String... strArr) {
            return construct(_asSet(strArr), this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge);
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
