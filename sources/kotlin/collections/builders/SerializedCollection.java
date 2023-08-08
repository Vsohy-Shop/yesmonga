package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.collections.C10927c1;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo22516d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "Lkotlin/d2;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "collection", "Ljava/util/Collection;", "", "tag", "I", "<init>", "(Ljava/util/Collection;I)V", "()V", "a", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
public final class SerializedCollection implements Externalizable {
    @C12579k

    /* renamed from: a */
    public static final C10918a f28159a = new C10918a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f28160b = 0;

    /* renamed from: c */
    public static final int f28161c = 1;
    private static final long serialVersionUID = 0;
    @C12579k
    private Collection<?> collection;
    private final int tag;

    /* renamed from: kotlin.collections.builders.SerializedCollection$a */
    public static final class C10918a {
        public /* synthetic */ C10918a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10918a() {
        }
    }

    public SerializedCollection(@C12579k Collection<?> collection2, int i) {
        Intrinsics.checkNotNullParameter(collection2, "collection");
        this.collection = collection2;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    public void readExternal(@C12579k ObjectInput objectInput) {
        Collection<?> collection2;
        Intrinsics.checkNotNullParameter(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List j = C10976s.m41418j(readInt);
                    while (i < readInt) {
                        j.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C10976s.m41409a(j);
                } else if (b == 1) {
                    Set e = C10927c1.m40882e(readInt);
                    while (i < readInt) {
                        e.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C10927c1.m40878a(e);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + '.');
                }
                this.collection = collection2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(@C12579k ObjectOutput objectOutput) {
        Intrinsics.checkNotNullParameter(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    public SerializedCollection() {
        this(CollectionsKt__CollectionsKt.m40441E(), 0);
    }
}
