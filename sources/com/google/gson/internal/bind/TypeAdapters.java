package com.google.gson.internal.bind;

import com.google.android.material.badge.C31132a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.gson.C33614e;
import com.google.gson.C33623h;
import com.google.gson.C33699k;
import com.google.gson.C33700l;
import com.google.gson.C33701m;
import com.google.gson.C33703o;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.C33608c;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final C33708s<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final C33714t ATOMIC_BOOLEAN_FACTORY;
    public static final C33708s<AtomicInteger> ATOMIC_INTEGER;
    public static final C33708s<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final C33714t ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final C33714t ATOMIC_INTEGER_FACTORY;
    public static final C33708s<BigDecimal> BIG_DECIMAL = new C33708s<BigDecimal>() {
        public BigDecimal read(C33710a aVar) throws IOException {
            if (aVar.peek() == JsonToken.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return new BigDecimal(aVar.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public void write(C33713c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.value((Number) bigDecimal);
        }
    };
    public static final C33708s<BigInteger> BIG_INTEGER = new C33708s<BigInteger>() {
        public BigInteger read(C33710a aVar) throws IOException {
            if (aVar.peek() == JsonToken.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return new BigInteger(aVar.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public void write(C33713c cVar, BigInteger bigInteger) throws IOException {
            cVar.value((Number) bigInteger);
        }
    };
    public static final C33708s<BitSet> BIT_SET;
    public static final C33714t BIT_SET_FACTORY;
    public static final C33708s<Boolean> BOOLEAN;
    public static final C33708s<Boolean> BOOLEAN_AS_STRING = new C33708s<Boolean>() {
        public Boolean read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return Boolean.valueOf(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, Boolean bool) throws IOException {
            cVar.value(bool == null ? "null" : bool.toString());
        }
    };
    public static final C33714t BOOLEAN_FACTORY;
    public static final C33708s<Number> BYTE;
    public static final C33714t BYTE_FACTORY;
    public static final C33708s<Calendar> CALENDAR;
    public static final C33714t CALENDAR_FACTORY;
    public static final C33708s<Character> CHARACTER;
    public static final C33714t CHARACTER_FACTORY;
    public static final C33708s<Class> CLASS;
    public static final C33714t CLASS_FACTORY;
    public static final C33708s<Currency> CURRENCY;
    public static final C33714t CURRENCY_FACTORY;
    public static final C33708s<Number> DOUBLE = new C33708s<Number>() {
        public Number read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, Number number) throws IOException {
            cVar.value(number);
        }
    };
    public static final C33714t ENUM_FACTORY = new C33714t() {
        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.gson.reflect.a, com.google.gson.reflect.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.C33708s<T> create(com.google.gson.C33614e r2, com.google.gson.reflect.C33707a<T> r3) {
            /*
                r1 = this;
                java.lang.Class r2 = r3.getRawType()
                java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
                boolean r0 = r3.isAssignableFrom(r2)
                if (r0 == 0) goto L_0x001f
                if (r2 != r3) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r3 = r2.isEnum()
                if (r3 != 0) goto L_0x0019
                java.lang.Class r2 = r2.getSuperclass()
            L_0x0019:
                com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter r3 = new com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter
                r3.<init>(r2)
                return r3
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C3368430.create(com.google.gson.e, com.google.gson.reflect.a):com.google.gson.s");
        }
    };
    public static final C33708s<Number> FLOAT = new C33708s<Number>() {
        public Number read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, Number number) throws IOException {
            cVar.value(number);
        }
    };
    public static final C33708s<InetAddress> INET_ADDRESS;
    public static final C33714t INET_ADDRESS_FACTORY;
    public static final C33708s<Number> INTEGER;
    public static final C33714t INTEGER_FACTORY;
    public static final C33708s<C33699k> JSON_ELEMENT;
    public static final C33714t JSON_ELEMENT_FACTORY;
    public static final C33708s<Locale> LOCALE;
    public static final C33714t LOCALE_FACTORY;
    public static final C33708s<Number> LONG = new C33708s<Number>() {
        public Number read(C33710a aVar) throws IOException {
            if (aVar.peek() == JsonToken.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public void write(C33713c cVar, Number number) throws IOException {
            cVar.value(number);
        }
    };
    public static final C33708s<Number> NUMBER;
    public static final C33714t NUMBER_FACTORY;
    public static final C33708s<Number> SHORT;
    public static final C33714t SHORT_FACTORY;
    public static final C33708s<String> STRING;
    public static final C33708s<StringBuffer> STRING_BUFFER;
    public static final C33714t STRING_BUFFER_FACTORY;
    public static final C33708s<StringBuilder> STRING_BUILDER;
    public static final C33714t STRING_BUILDER_FACTORY;
    public static final C33714t STRING_FACTORY;
    public static final C33714t TIMESTAMP_FACTORY = new C33714t() {
        public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            final C33708s<Date> q = eVar.mo97482q(Date.class);
            return new C33708s<Timestamp>() {
                public Timestamp read(C33710a aVar) throws IOException {
                    Date date = (Date) q.read(aVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                public void write(C33713c cVar, Timestamp timestamp) throws IOException {
                    q.write(cVar, timestamp);
                }
            };
        }
    };
    public static final C33708s<URI> URI;
    public static final C33714t URI_FACTORY;
    public static final C33708s<URL> URL;
    public static final C33714t URL_FACTORY;
    public static final C33708s<UUID> UUID;
    public static final C33714t UUID_FACTORY;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$36 */
    public static /* synthetic */ class C3369136 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C3369136.<clinit>():void");
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends C33708s<T> {
        private final Map<T, String> constantToName = new HashMap();
        private final Map<String, T> nameToConstant = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C33608c cVar = (C33608c) cls.getField(name).getAnnotation(C33608c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.nameToConstant.put(put, enumR);
                        }
                    }
                    this.nameToConstant.put(name, enumR);
                    this.constantToName.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        public T read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return (Enum) this.nameToConstant.get(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, T t) throws IOException {
            cVar.value(t == null ? null : this.constantToName.get(t));
        }
    }

    static {
        C33708s<Class> nullSafe = new C33708s<Class>() {
            public Class read(C33710a aVar) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void write(C33713c cVar, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(Class.class, nullSafe);
        C33708s<BitSet> nullSafe2 = new C33708s<BitSet>() {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
                if (r8.nextInt() != 0) goto L_0x0069;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.BitSet read(com.google.gson.stream.C33710a r8) throws java.io.IOException {
                /*
                    r7 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.beginArray()
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    r2 = 0
                    r3 = r2
                L_0x000e:
                    com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                    if (r1 == r4) goto L_0x0075
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.C3369136.$SwitchMap$com$google$gson$stream$JsonToken
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L_0x0063
                    r6 = 2
                    if (r4 == r6) goto L_0x005e
                    r6 = 3
                    if (r4 != r6) goto L_0x0047
                    java.lang.String r1 = r8.nextString()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                    if (r1 == 0) goto L_0x002e
                    goto L_0x0069
                L_0x002e:
                    r5 = r2
                    goto L_0x0069
                L_0x0030:
                    com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x0047:
                    com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x005e:
                    boolean r5 = r8.nextBoolean()
                    goto L_0x0069
                L_0x0063:
                    int r1 = r8.nextInt()
                    if (r1 == 0) goto L_0x002e
                L_0x0069:
                    if (r5 == 0) goto L_0x006e
                    r0.set(r3)
                L_0x006e:
                    int r3 = r3 + 1
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    goto L_0x000e
                L_0x0075:
                    r8.endArray()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C336712.read(com.google.gson.stream.a):java.util.BitSet");
            }

            public void write(C33713c cVar, BitSet bitSet) throws IOException {
                cVar.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    cVar.value(bitSet.get(i) ? 1 : 0);
                }
                cVar.endArray();
            }
        }.nullSafe();
        BIT_SET = nullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, nullSafe2);
        C336833 r0 = new C33708s<Boolean>() {
            public Boolean read(C33710a aVar) throws IOException {
                JsonToken peek = aVar.peek();
                if (peek == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                } else if (peek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.nextString()));
                } else {
                    return Boolean.valueOf(aVar.nextBoolean());
                }
            }

            public void write(C33713c cVar, Boolean bool) throws IOException {
                cVar.value(bool);
            }
        };
        BOOLEAN = r0;
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, r0);
        C336935 r02 = new C33708s<Number>() {
            public Number read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            public void write(C33713c cVar, Number number) throws IOException {
                cVar.value(number);
            }
        };
        BYTE = r02;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, r02);
        C336946 r03 = new C33708s<Number>() {
            public Number read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            public void write(C33713c cVar, Number number) throws IOException {
                cVar.value(number);
            }
        };
        SHORT = r03;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, r03);
        C336957 r04 = new C33708s<Number>() {
            public Number read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            public void write(C33713c cVar, Number number) throws IOException {
                cVar.value(number);
            }
        };
        INTEGER = r04;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, r04);
        C33708s<AtomicInteger> nullSafe3 = new C33708s<AtomicInteger>() {
            public AtomicInteger read(C33710a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }

            public void write(C33713c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.value((long) atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, nullSafe3);
        C33708s<AtomicBoolean> nullSafe4 = new C33708s<AtomicBoolean>() {
            public AtomicBoolean read(C33710a aVar) throws IOException {
                return new AtomicBoolean(aVar.nextBoolean());
            }

            public void write(C33713c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, nullSafe4);
        C33708s<AtomicIntegerArray> nullSafe5 = new C33708s<AtomicIntegerArray>() {
            public AtomicIntegerArray read(C33710a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.beginArray();
                while (aVar.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                }
                aVar.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            public void write(C33713c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    cVar.value((long) atomicIntegerArray.get(i));
                }
                cVar.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = nullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, nullSafe5);
        C3366514 r05 = new C33708s<Number>() {
            public Number read(C33710a aVar) throws IOException {
                JsonToken peek = aVar.peek();
                int i = C3369136.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                if (i == 1 || i == 3) {
                    return new LazilyParsedNumber(aVar.nextString());
                }
                if (i == 4) {
                    aVar.nextNull();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + peek);
            }

            public void write(C33713c cVar, Number number) throws IOException {
                cVar.value(number);
            }
        };
        NUMBER = r05;
        NUMBER_FACTORY = newFactory(Number.class, r05);
        C3366615 r06 = new C33708s<Character>() {
            public Character read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String nextString = aVar.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + nextString);
            }

            public void write(C33713c cVar, Character ch) throws IOException {
                cVar.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = r06;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, r06);
        C3366716 r07 = new C33708s<String>() {
            public String read(C33710a aVar) throws IOException {
                JsonToken peek = aVar.peek();
                if (peek == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                } else if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(aVar.nextBoolean());
                } else {
                    return aVar.nextString();
                }
            }

            public void write(C33713c cVar, String str) throws IOException {
                cVar.value(str);
            }
        };
        STRING = r07;
        STRING_FACTORY = newFactory(String.class, r07);
        C3367019 r08 = new C33708s<StringBuilder>() {
            public StringBuilder read(C33710a aVar) throws IOException {
                if (aVar.peek() != JsonToken.NULL) {
                    return new StringBuilder(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            public void write(C33713c cVar, StringBuilder sb) throws IOException {
                cVar.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = r08;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, r08);
        C3367220 r09 = new C33708s<StringBuffer>() {
            public StringBuffer read(C33710a aVar) throws IOException {
                if (aVar.peek() != JsonToken.NULL) {
                    return new StringBuffer(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            public void write(C33713c cVar, StringBuffer stringBuffer) throws IOException {
                cVar.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = r09;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, r09);
        C3367321 r010 = new C33708s<URL>() {
            public URL read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String nextString = aVar.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            public void write(C33713c cVar, URL url) throws IOException {
                cVar.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = r010;
        URL_FACTORY = newFactory(URL.class, r010);
        C3367422 r011 = new C33708s<URI>() {
            public URI read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    String nextString = aVar.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e) {
                    throw new JsonIOException((Throwable) e);
                }
            }

            public void write(C33713c cVar, URI uri) throws IOException {
                cVar.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = r011;
        URI_FACTORY = newFactory(URI.class, r011);
        C3367523 r012 = new C33708s<InetAddress>() {
            public InetAddress read(C33710a aVar) throws IOException {
                if (aVar.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            public void write(C33713c cVar, InetAddress inetAddress) throws IOException {
                cVar.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = r012;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, r012);
        C3367624 r013 = new C33708s<UUID>() {
            public UUID read(C33710a aVar) throws IOException {
                if (aVar.peek() != JsonToken.NULL) {
                    return UUID.fromString(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            public void write(C33713c cVar, UUID uuid) throws IOException {
                cVar.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = r013;
        UUID_FACTORY = newFactory(UUID.class, r013);
        C33708s<Currency> nullSafe6 = new C33708s<Currency>() {
            public Currency read(C33710a aVar) throws IOException {
                return Currency.getInstance(aVar.nextString());
            }

            public void write(C33713c cVar, Currency currency) throws IOException {
                cVar.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, nullSafe6);
        C3368027 r014 = new C33708s<Calendar>() {
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            public Calendar read(C33710a aVar) throws IOException {
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                aVar.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (aVar.peek() != JsonToken.END_OBJECT) {
                    String nextName = aVar.nextName();
                    int nextInt = aVar.nextInt();
                    if (YEAR.equals(nextName)) {
                        i = nextInt;
                    } else if (MONTH.equals(nextName)) {
                        i2 = nextInt;
                    } else if (DAY_OF_MONTH.equals(nextName)) {
                        i3 = nextInt;
                    } else if (HOUR_OF_DAY.equals(nextName)) {
                        i4 = nextInt;
                    } else if (MINUTE.equals(nextName)) {
                        i5 = nextInt;
                    } else if (SECOND.equals(nextName)) {
                        i6 = nextInt;
                    }
                }
                aVar.endObject();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            public void write(C33713c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.nullValue();
                    return;
                }
                cVar.beginObject();
                cVar.name(YEAR);
                cVar.value((long) calendar.get(1));
                cVar.name(MONTH);
                cVar.value((long) calendar.get(2));
                cVar.name(DAY_OF_MONTH);
                cVar.value((long) calendar.get(5));
                cVar.name(HOUR_OF_DAY);
                cVar.value((long) calendar.get(11));
                cVar.name(MINUTE);
                cVar.value((long) calendar.get(12));
                cVar.name(SECOND);
                cVar.value((long) calendar.get(13));
                cVar.endObject();
            }
        };
        CALENDAR = r014;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, r014);
        C3368128 r015 = new C33708s<Locale>() {
            public Locale read(C33710a aVar) throws IOException {
                String str = null;
                if (aVar.peek() == JsonToken.NULL) {
                    aVar.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.nextString(), C32920e.f79928l);
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }

            public void write(C33713c cVar, Locale locale) throws IOException {
                cVar.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = r015;
        LOCALE_FACTORY = newFactory(Locale.class, r015);
        C3368229 r016 = new C33708s<C33699k>() {
            public C33699k read(C33710a aVar) throws IOException {
                switch (C3369136.$SwitchMap$com$google$gson$stream$JsonToken[aVar.peek().ordinal()]) {
                    case 1:
                        return new C33703o((Number) new LazilyParsedNumber(aVar.nextString()));
                    case 2:
                        return new C33703o(Boolean.valueOf(aVar.nextBoolean()));
                    case 3:
                        return new C33703o(aVar.nextString());
                    case 4:
                        aVar.nextNull();
                        return C33700l.f81818a;
                    case 5:
                        C33623h hVar = new C33623h();
                        aVar.beginArray();
                        while (aVar.hasNext()) {
                            hVar.mo97541m0(read(aVar));
                        }
                        aVar.endArray();
                        return hVar;
                    case 6:
                        C33701m mVar = new C33701m();
                        aVar.beginObject();
                        while (aVar.hasNext()) {
                            mVar.mo97786m0(aVar.nextName(), read(aVar));
                        }
                        aVar.endObject();
                        return mVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            public void write(C33713c cVar, C33699k kVar) throws IOException {
                if (kVar == null || kVar.mo97773j0()) {
                    cVar.nullValue();
                } else if (kVar.mo97775l0()) {
                    C33703o X = kVar.mo97771X();
                    if (X.mo97806p0()) {
                        cVar.value(X.mo97532e0());
                    } else if (X.mo97805n0()) {
                        cVar.value(X.mo97540k());
                    } else {
                        cVar.value(X.mo97536h0());
                    }
                } else if (kVar.mo97772i0()) {
                    cVar.beginArray();
                    Iterator<C33699k> it = kVar.mo97768M().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.endArray();
                } else if (kVar.mo97774k0()) {
                    cVar.beginObject();
                    for (Map.Entry next : kVar.mo97770W().mo97794u0()) {
                        cVar.name((String) next.getKey());
                        write(cVar, (C33699k) next.getValue());
                    }
                    cVar.endObject();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
                }
            }
        };
        JSON_ELEMENT = r016;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(C33699k.class, r016);
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> C33714t newFactory(final C33707a<TT> aVar, final C33708s<TT> sVar) {
        return new C33714t() {
            public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
                if (aVar.equals(aVar)) {
                    return sVar;
                }
                return null;
            }
        };
    }

    public static <TT> C33714t newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final C33708s<? super TT> sVar) {
        return new C33714t() {
            public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + C31132a.f74628J0 + cls2.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <T1> C33714t newTypeHierarchyFactory(final Class<T1> cls, final C33708s<T1> sVar) {
        return new C33714t() {
            public <T2> C33708s<T2> create(C33614e eVar, C33707a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C33708s<T1>() {
                    public T1 read(C33710a aVar) throws IOException {
                        T1 read = sVar.read(aVar);
                        if (read == null || rawType.isInstance(read)) {
                            return read;
                        }
                        throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + read.getClass().getName());
                    }

                    public void write(C33713c cVar, T1 t1) throws IOException {
                        sVar.write(cVar, t1);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> C33714t newFactory(final Class<TT> cls, final C33708s<TT> sVar) {
        return new C33714t() {
            public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
                if (aVar.getRawType() == cls) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> C33714t newFactory(final Class<TT> cls, final Class<TT> cls2, final C33708s<? super TT> sVar) {
        return new C33714t() {
            public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + C31132a.f74628J0 + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }
}
