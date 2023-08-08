package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8698y1;
import com.urbanairship.util.C9647e0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import kotlinx.serialization.internal.C12312t0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\b\n\u0002\bq\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 í\u00012\u00020\u0001:\u0004î\u0001í\u0001B£\u0005\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010T\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010]\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010_\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010?¢\u0006\u0006\bæ\u0001\u0010ç\u0001BÃ\u0005\b\u0017\u0012\u0007\u0010è\u0001\u001a\u00020x\u0012\u0007\u0010é\u0001\u001a\u00020x\u0012\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010M\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010P\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010T\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010V\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010Z\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0001\u0010[\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010]\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0001\u0010^\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0001\u0010_\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\n\b\u0001\u0010`\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010g\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010h\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010l\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010m\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010o\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010s\u001a\u0004\u0018\u00010?\u0012\n\b\u0001\u0010t\u001a\u0004\u0018\u00010?\u0012\n\u0010ë\u0001\u001a\u0005\u0018\u00010ê\u0001¢\u0006\u0006\bæ\u0001\u0010ì\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010\u000bJ\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010@\u001a\u0004\u0018\u00010?HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010?HÆ\u0003¢\u0006\u0004\bB\u0010AJª\u0005\u0010u\u001a\u00020\u00002\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\u0010\b\u0002\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010T\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\u0010\b\u0002\u0010]\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\n\b\u0002\u0010^\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010_\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010?HÆ\u0001¢\u0006\u0004\bu\u0010vJ\t\u0010w\u001a\u00020\fHÖ\u0001J\t\u0010y\u001a\u00020xHÖ\u0001J\u0013\u0010{\u001a\u00020?2\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010C\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010|\u0012\u0004\b~\u0010\u001a\u0004\b}\u0010\u000bR&\u0010D\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bD\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010E\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bE\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010F\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bF\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010G\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bG\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010H\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bH\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010I\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bI\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010J\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bJ\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010K\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bK\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R,\u0010L\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bL\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R,\u0010M\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bM\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R,\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bN\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R,\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bO\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R,\u0010P\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bP\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010Q\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bQ\u0010\u0001\u0012\u0005\b\u0001\u0010\u001a\u0006\b\u0001\u0010\u0001R&\u0010R\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bR\u0010\u0001\u0012\u0005\b¡\u0001\u0010\u001a\u0006\b \u0001\u0010\u0001R&\u0010S\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bS\u0010\u0001\u0012\u0005\b£\u0001\u0010\u001a\u0006\b¢\u0001\u0010\u0001R,\u0010T\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bT\u0010\u0001\u0012\u0005\b¥\u0001\u0010\u001a\u0006\b¤\u0001\u0010\u0001R&\u0010U\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bU\u0010\u0001\u0012\u0005\b§\u0001\u0010\u001a\u0006\b¦\u0001\u0010\u0001R,\u0010V\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bV\u0010\u0001\u0012\u0005\b©\u0001\u0010\u001a\u0006\b¨\u0001\u0010\u0001R&\u0010W\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bW\u0010\u0001\u0012\u0005\b«\u0001\u0010\u001a\u0006\bª\u0001\u0010\u0001R&\u0010X\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bX\u0010\u0001\u0012\u0005\b­\u0001\u0010\u001a\u0006\b¬\u0001\u0010\u0001R&\u0010Y\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bY\u0010\u0001\u0012\u0005\b¯\u0001\u0010\u001a\u0006\b®\u0001\u0010\u0001R,\u0010Z\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\bZ\u0010\u0001\u0012\u0005\b±\u0001\u0010\u001a\u0006\b°\u0001\u0010\u0001R&\u0010[\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\b[\u0010\u0001\u0012\u0005\b³\u0001\u0010\u001a\u0006\b²\u0001\u0010\u0001R,\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\b\\\u0010\u0001\u0012\u0005\bµ\u0001\u0010\u001a\u0006\b´\u0001\u0010\u0001R,\u0010]\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\b]\u0010\u0001\u0012\u0005\b·\u0001\u0010\u001a\u0006\b¶\u0001\u0010\u0001R%\u0010^\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0015\n\u0005\b^\u0010¸\u0001\u0012\u0005\bº\u0001\u0010\u001a\u0005\b¹\u0001\u0010*R,\u0010_\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0016\n\u0005\b_\u0010\u0001\u0012\u0005\b¼\u0001\u0010\u001a\u0006\b»\u0001\u0010\u0001R&\u0010`\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\b`\u0010\u0001\u0012\u0005\b¾\u0001\u0010\u001a\u0006\b½\u0001\u0010\u0001R&\u0010a\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\ba\u0010\u0001\u0012\u0005\bÀ\u0001\u0010\u001a\u0006\b¿\u0001\u0010\u0001R&\u0010b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bb\u0010\u0001\u0012\u0005\bÂ\u0001\u0010\u001a\u0006\bÁ\u0001\u0010\u0001R&\u0010c\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bc\u0010\u0001\u0012\u0005\bÄ\u0001\u0010\u001a\u0006\bÃ\u0001\u0010\u0001R&\u0010d\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bd\u0010\u0001\u0012\u0005\bÆ\u0001\u0010\u001a\u0006\bÅ\u0001\u0010\u0001R$\u0010e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\be\u0010|\u0012\u0005\bÈ\u0001\u0010\u001a\u0005\bÇ\u0001\u0010\u000bR&\u0010f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bf\u0010\u0001\u0012\u0005\bÊ\u0001\u0010\u001a\u0006\bÉ\u0001\u0010\u0001R&\u0010g\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bg\u0010\u0001\u0012\u0005\bÌ\u0001\u0010\u001a\u0006\bË\u0001\u0010\u0001R&\u0010h\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bh\u0010\u0001\u0012\u0005\bÎ\u0001\u0010\u001a\u0006\bÍ\u0001\u0010\u0001R&\u0010i\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bi\u0010\u0001\u0012\u0005\bÐ\u0001\u0010\u001a\u0006\bÏ\u0001\u0010\u0001R&\u0010j\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bj\u0010\u0001\u0012\u0005\bÒ\u0001\u0010\u001a\u0006\bÑ\u0001\u0010\u0001R&\u0010k\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bk\u0010\u0001\u0012\u0005\bÔ\u0001\u0010\u001a\u0006\bÓ\u0001\u0010\u0001R&\u0010l\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bl\u0010\u0001\u0012\u0005\bÖ\u0001\u0010\u001a\u0006\bÕ\u0001\u0010\u0001R&\u0010m\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bm\u0010\u0001\u0012\u0005\bØ\u0001\u0010\u001a\u0006\b×\u0001\u0010\u0001R&\u0010n\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bn\u0010\u0001\u0012\u0005\bÚ\u0001\u0010\u001a\u0006\bÙ\u0001\u0010\u0001R&\u0010o\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bo\u0010\u0001\u0012\u0005\bÜ\u0001\u0010\u001a\u0006\bÛ\u0001\u0010\u0001R&\u0010p\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bp\u0010\u0001\u0012\u0005\bÞ\u0001\u0010\u001a\u0006\bÝ\u0001\u0010\u0001R&\u0010q\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\bq\u0010\u0001\u0012\u0005\bà\u0001\u0010\u001a\u0006\bß\u0001\u0010\u0001R&\u0010r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0016\n\u0005\br\u0010\u0001\u0012\u0005\bâ\u0001\u0010\u001a\u0006\bá\u0001\u0010\u0001R$\u0010s\u001a\u0004\u0018\u00010?8\u0006X\u0004¢\u0006\u0014\n\u0005\bs\u0010ã\u0001\u0012\u0005\bä\u0001\u0010\u001a\u0004\bs\u0010AR$\u0010t\u001a\u0004\u0018\u00010?8\u0006X\u0004¢\u0006\u0014\n\u0005\bt\u0010ã\u0001\u0012\u0005\bå\u0001\u0010\u001a\u0004\bt\u0010A¨\u0006ï\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "", "component28", "()Ljava/lang/Double;", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "", "component49", "()Ljava/lang/Boolean;", "component50", "volumeCapacity", "color", "shortDesignation", "longDescription", "typeOfCare", "guarantee", "energyClass", "authorDirectorArtist", "summary", "hairTypes", "productProperties", "productTreatmentList", "productUsage", "skinType", "solarProtectionEfficiency", "sunBurnProtectionFactor", "productTexture", "compatibleModelsAndBrands", "dimensions", "linenTreatment", "audioLanguage", "subtitleLanguage", "releaseDate", "mediaFormat", "dogSize", "typeOfMemoryCards", "wirelessConnection", "bladesNumber", "powerSourceType", "animalBreed", "typeOfLighting", "endedLightBulbType", "lightBulbType", "batteryType", "electricalPower", "textileSize", "marketingAllegations", "taxMessage", "brandCompatibility", "modelCompatibility", "pillowShape", "grPerM2", "quireType", "diapersSize", "diapersNumber", "nailType", "careProductType", "washableDiapersType", "isTestedOnAnimals", "isRechargeable", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Long;", "getVolumeCapacity", "getVolumeCapacity$annotations", "()V", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "getColor$annotations", "getShortDesignation", "getShortDesignation$annotations", "getLongDescription", "getLongDescription$annotations", "getTypeOfCare", "getTypeOfCare$annotations", "getGuarantee", "getGuarantee$annotations", "getEnergyClass", "getEnergyClass$annotations", "getAuthorDirectorArtist", "getAuthorDirectorArtist$annotations", "getSummary", "getSummary$annotations", "Ljava/util/List;", "getHairTypes", "()Ljava/util/List;", "getHairTypes$annotations", "getProductProperties", "getProductProperties$annotations", "getProductTreatmentList", "getProductTreatmentList$annotations", "getProductUsage", "getProductUsage$annotations", "getSkinType", "getSkinType$annotations", "getSolarProtectionEfficiency", "getSolarProtectionEfficiency$annotations", "getSunBurnProtectionFactor", "getSunBurnProtectionFactor$annotations", "getProductTexture", "getProductTexture$annotations", "getCompatibleModelsAndBrands", "getCompatibleModelsAndBrands$annotations", "getDimensions", "getDimensions$annotations", "getLinenTreatment", "getLinenTreatment$annotations", "getAudioLanguage", "getAudioLanguage$annotations", "getSubtitleLanguage", "getSubtitleLanguage$annotations", "getReleaseDate", "getReleaseDate$annotations", "getMediaFormat", "getMediaFormat$annotations", "getDogSize", "getDogSize$annotations", "getTypeOfMemoryCards", "getTypeOfMemoryCards$annotations", "getWirelessConnection", "getWirelessConnection$annotations", "Ljava/lang/Double;", "getBladesNumber", "getBladesNumber$annotations", "getPowerSourceType", "getPowerSourceType$annotations", "getAnimalBreed", "getAnimalBreed$annotations", "getTypeOfLighting", "getTypeOfLighting$annotations", "getEndedLightBulbType", "getEndedLightBulbType$annotations", "getLightBulbType", "getLightBulbType$annotations", "getBatteryType", "getBatteryType$annotations", "getElectricalPower", "getElectricalPower$annotations", "getTextileSize", "getTextileSize$annotations", "getMarketingAllegations", "getMarketingAllegations$annotations", "getTaxMessage", "getTaxMessage$annotations", "getBrandCompatibility", "getBrandCompatibility$annotations", "getModelCompatibility", "getModelCompatibility$annotations", "getPillowShape", "getPillowShape$annotations", "getGrPerM2", "getGrPerM2$annotations", "getQuireType", "getQuireType$annotations", "getDiapersSize", "getDiapersSize$annotations", "getDiapersNumber", "getDiapersNumber$annotations", "getNailType", "getNailType$annotations", "getCareProductType", "getCareProductType$annotations", "getWashableDiapersType", "getWashableDiapersType$annotations", "Ljava/lang/Boolean;", "isTestedOnAnimals$annotations", "isRechargeable$annotations", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "seen2", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffNonFood {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String animalBreed;
    @C12580l
    private final String audioLanguage;
    @C12580l
    private final String authorDirectorArtist;
    @C12580l
    private final String batteryType;
    @C12580l
    private final Double bladesNumber;
    @C12580l
    private final String brandCompatibility;
    @C12580l
    private final String careProductType;
    @C12580l
    private final String color;
    @C12580l
    private final List<String> compatibleModelsAndBrands;
    @C12580l
    private final String diapersNumber;
    @C12580l
    private final String diapersSize;
    @C12580l
    private final String dimensions;
    @C12580l
    private final String dogSize;
    @C12580l
    private final Long electricalPower;
    @C12580l
    private final String endedLightBulbType;
    @C12580l
    private final String energyClass;
    @C12580l
    private final String grPerM2;
    @C12580l
    private final String guarantee;
    @C12580l
    private final List<String> hairTypes;
    @C12580l
    private final Boolean isRechargeable;
    @C12580l
    private final Boolean isTestedOnAnimals;
    @C12580l
    private final String lightBulbType;
    @C12580l
    private final List<String> linenTreatment;
    @C12580l
    private final String longDescription;
    @C12580l
    private final String marketingAllegations;
    @C12580l
    private final List<String> mediaFormat;
    @C12580l
    private final String modelCompatibility;
    @C12580l
    private final String nailType;
    @C12580l
    private final String pillowShape;
    @C12580l
    private final List<String> powerSourceType;
    @C12580l
    private final List<String> productProperties;
    @C12580l
    private final String productTexture;
    @C12580l
    private final List<String> productTreatmentList;
    @C12580l
    private final List<String> productUsage;
    @C12580l
    private final String quireType;
    @C12580l
    private final String releaseDate;
    @C12580l
    private final String shortDesignation;
    @C12580l
    private final List<String> skinType;
    @C12580l
    private final String solarProtectionEfficiency;
    @C12580l
    private final String subtitleLanguage;
    @C12580l
    private final String summary;
    @C12580l
    private final String sunBurnProtectionFactor;
    @C12580l
    private final String taxMessage;
    @C12580l
    private final String textileSize;
    @C12580l
    private final String typeOfCare;
    @C12580l
    private final String typeOfLighting;
    @C12580l
    private final List<String> typeOfMemoryCards;
    @C12580l
    private final Long volumeCapacity;
    @C12580l
    private final String washableDiapersType;
    @C12580l
    private final List<String> wirelessConnection;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNonFood;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffNonFood> serializer() {
            return BffNonFood$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, null, null, null, null, null, null, null, new C12269f(s1Var), new C12269f(s1Var), new C12269f(s1Var), new C12269f(s1Var), new C12269f(s1Var), null, null, null, new C12269f(s1Var), null, new C12269f(s1Var), null, null, null, new C12269f(s1Var), null, new C12269f(s1Var), new C12269f(s1Var), null, new C12269f(s1Var), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public BffNonFood() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, (List) null, (List) null, (Double) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, -1, (int) C16476b.f40862n, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffNonFood copy$default(BffNonFood bffNonFood, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, List list5, String str9, String str10, String str11, List list6, String str12, List list7, String str13, String str14, String str15, List list8, String str16, List list9, List list10, Double d, List list11, String str17, String str18, String str19, String str20, String str21, Long l2, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Boolean bool, Boolean bool2, int i, int i2, Object obj) {
        BffNonFood bffNonFood2 = bffNonFood;
        int i3 = i;
        int i4 = i2;
        return bffNonFood.copy((i3 & 1) != 0 ? bffNonFood2.volumeCapacity : l, (i3 & 2) != 0 ? bffNonFood2.color : str, (i3 & 4) != 0 ? bffNonFood2.shortDesignation : str2, (i3 & 8) != 0 ? bffNonFood2.longDescription : str3, (i3 & 16) != 0 ? bffNonFood2.typeOfCare : str4, (i3 & 32) != 0 ? bffNonFood2.guarantee : str5, (i3 & 64) != 0 ? bffNonFood2.energyClass : str6, (i3 & 128) != 0 ? bffNonFood2.authorDirectorArtist : str7, (i3 & 256) != 0 ? bffNonFood2.summary : str8, (i3 & 512) != 0 ? bffNonFood2.hairTypes : list, (i3 & 1024) != 0 ? bffNonFood2.productProperties : list2, (i3 & 2048) != 0 ? bffNonFood2.productTreatmentList : list3, (i3 & 4096) != 0 ? bffNonFood2.productUsage : list4, (i3 & 8192) != 0 ? bffNonFood2.skinType : list5, (i3 & 16384) != 0 ? bffNonFood2.solarProtectionEfficiency : str9, (i3 & 32768) != 0 ? bffNonFood2.sunBurnProtectionFactor : str10, (i3 & 65536) != 0 ? bffNonFood2.productTexture : str11, (i3 & 131072) != 0 ? bffNonFood2.compatibleModelsAndBrands : list6, (i3 & 262144) != 0 ? bffNonFood2.dimensions : str12, (i3 & 524288) != 0 ? bffNonFood2.linenTreatment : list7, (i3 & 1048576) != 0 ? bffNonFood2.audioLanguage : str13, (i3 & 2097152) != 0 ? bffNonFood2.subtitleLanguage : str14, (i3 & 4194304) != 0 ? bffNonFood2.releaseDate : str15, (i3 & 8388608) != 0 ? bffNonFood2.mediaFormat : list8, (i3 & 16777216) != 0 ? bffNonFood2.dogSize : str16, (i3 & C9647e0.f26435a) != 0 ? bffNonFood2.typeOfMemoryCards : list9, (i3 & C8698y1.f23302n) != 0 ? bffNonFood2.wirelessConnection : list10, (i3 & C8698y1.f23301m) != 0 ? bffNonFood2.bladesNumber : d, (i3 & 268435456) != 0 ? bffNonFood2.powerSourceType : list11, (i3 & 536870912) != 0 ? bffNonFood2.animalBreed : str17, (i3 & 1073741824) != 0 ? bffNonFood2.typeOfLighting : str18, (i3 & Integer.MIN_VALUE) != 0 ? bffNonFood2.endedLightBulbType : str19, (i4 & 1) != 0 ? bffNonFood2.lightBulbType : str20, (i4 & 2) != 0 ? bffNonFood2.batteryType : str21, (i4 & 4) != 0 ? bffNonFood2.electricalPower : l2, (i4 & 8) != 0 ? bffNonFood2.textileSize : str22, (i4 & 16) != 0 ? bffNonFood2.marketingAllegations : str23, (i4 & 32) != 0 ? bffNonFood2.taxMessage : str24, (i4 & 64) != 0 ? bffNonFood2.brandCompatibility : str25, (i4 & 128) != 0 ? bffNonFood2.modelCompatibility : str26, (i4 & 256) != 0 ? bffNonFood2.pillowShape : str27, (i4 & 512) != 0 ? bffNonFood2.grPerM2 : str28, (i4 & 1024) != 0 ? bffNonFood2.quireType : str29, (i4 & 2048) != 0 ? bffNonFood2.diapersSize : str30, (i4 & 4096) != 0 ? bffNonFood2.diapersNumber : str31, (i4 & 8192) != 0 ? bffNonFood2.nailType : str32, (i4 & 16384) != 0 ? bffNonFood2.careProductType : str33, (i4 & 32768) != 0 ? bffNonFood2.washableDiapersType : str34, (i4 & 65536) != 0 ? bffNonFood2.isTestedOnAnimals : bool, (i4 & 131072) != 0 ? bffNonFood2.isRechargeable : bool2);
    }

    @C12438n("animal_breed")
    public static /* synthetic */ void getAnimalBreed$annotations() {
    }

    @C12438n("audio_language")
    public static /* synthetic */ void getAudioLanguage$annotations() {
    }

    @C12438n("author_director_artist")
    public static /* synthetic */ void getAuthorDirectorArtist$annotations() {
    }

    @C12438n("battery_type")
    public static /* synthetic */ void getBatteryType$annotations() {
    }

    @C12438n("blades_number")
    public static /* synthetic */ void getBladesNumber$annotations() {
    }

    @C12438n("brand_compatibility")
    public static /* synthetic */ void getBrandCompatibility$annotations() {
    }

    @C12438n("care_product_type")
    public static /* synthetic */ void getCareProductType$annotations() {
    }

    @C12438n("color")
    public static /* synthetic */ void getColor$annotations() {
    }

    @C12438n("compatible_models_and_brands")
    public static /* synthetic */ void getCompatibleModelsAndBrands$annotations() {
    }

    @C12438n("diapers_number")
    public static /* synthetic */ void getDiapersNumber$annotations() {
    }

    @C12438n("diapers_size")
    public static /* synthetic */ void getDiapersSize$annotations() {
    }

    @C12438n("dimensions")
    public static /* synthetic */ void getDimensions$annotations() {
    }

    @C12438n("dog_size")
    public static /* synthetic */ void getDogSize$annotations() {
    }

    @C12438n("electrical_power")
    public static /* synthetic */ void getElectricalPower$annotations() {
    }

    @C12438n("ended_light_bulb_type")
    public static /* synthetic */ void getEndedLightBulbType$annotations() {
    }

    @C12438n("energy_class")
    public static /* synthetic */ void getEnergyClass$annotations() {
    }

    @C12438n("gr_per_m2")
    public static /* synthetic */ void getGrPerM2$annotations() {
    }

    @C12438n("guarantee")
    public static /* synthetic */ void getGuarantee$annotations() {
    }

    @C12438n("hair_types")
    public static /* synthetic */ void getHairTypes$annotations() {
    }

    @C12438n("light_bulb_type")
    public static /* synthetic */ void getLightBulbType$annotations() {
    }

    @C12438n("linen_treatment")
    public static /* synthetic */ void getLinenTreatment$annotations() {
    }

    @C12438n("long_description")
    public static /* synthetic */ void getLongDescription$annotations() {
    }

    @C12438n("marketing_allegations")
    public static /* synthetic */ void getMarketingAllegations$annotations() {
    }

    @C12438n("media_format")
    public static /* synthetic */ void getMediaFormat$annotations() {
    }

    @C12438n("model_compatibility")
    public static /* synthetic */ void getModelCompatibility$annotations() {
    }

    @C12438n("nail_type")
    public static /* synthetic */ void getNailType$annotations() {
    }

    @C12438n("pillow_shape")
    public static /* synthetic */ void getPillowShape$annotations() {
    }

    @C12438n("power_source_type")
    public static /* synthetic */ void getPowerSourceType$annotations() {
    }

    @C12438n("product_properties")
    public static /* synthetic */ void getProductProperties$annotations() {
    }

    @C12438n("product_texture")
    public static /* synthetic */ void getProductTexture$annotations() {
    }

    @C12438n("product_treatment_list")
    public static /* synthetic */ void getProductTreatmentList$annotations() {
    }

    @C12438n("product_usage")
    public static /* synthetic */ void getProductUsage$annotations() {
    }

    @C12438n("quire_type")
    public static /* synthetic */ void getQuireType$annotations() {
    }

    @C12438n("release_date")
    public static /* synthetic */ void getReleaseDate$annotations() {
    }

    @C12438n("short_designation")
    public static /* synthetic */ void getShortDesignation$annotations() {
    }

    @C12438n("skin_type")
    public static /* synthetic */ void getSkinType$annotations() {
    }

    @C12438n("solar_protection_efficiency")
    public static /* synthetic */ void getSolarProtectionEfficiency$annotations() {
    }

    @C12438n("subtitle_language")
    public static /* synthetic */ void getSubtitleLanguage$annotations() {
    }

    @C12438n("summary")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @C12438n("sun_burn_protection_factor")
    public static /* synthetic */ void getSunBurnProtectionFactor$annotations() {
    }

    @C12438n("tax_message")
    public static /* synthetic */ void getTaxMessage$annotations() {
    }

    @C12438n("textile_size")
    public static /* synthetic */ void getTextileSize$annotations() {
    }

    @C12438n("type_of_care")
    public static /* synthetic */ void getTypeOfCare$annotations() {
    }

    @C12438n("type_of_lighting")
    public static /* synthetic */ void getTypeOfLighting$annotations() {
    }

    @C12438n("type_of_memory_cards")
    public static /* synthetic */ void getTypeOfMemoryCards$annotations() {
    }

    @C12438n("volume_capacity")
    public static /* synthetic */ void getVolumeCapacity$annotations() {
    }

    @C12438n("washable_diapers_type")
    public static /* synthetic */ void getWashableDiapersType$annotations() {
    }

    @C12438n("wireless_connection")
    public static /* synthetic */ void getWirelessConnection$annotations() {
    }

    @C12438n("is_rechargeable")
    public static /* synthetic */ void isRechargeable$annotations() {
    }

    @C12438n("is_tested_on_animals")
    public static /* synthetic */ void isTestedOnAnimals$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffNonFood bffNonFood, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffNonFood.volumeCapacity != null) {
            dVar.mo24912i(fVar, 0, C12312t0.f30121a, bffNonFood.volumeCapacity);
        }
        if (dVar.mo24897A(fVar, 1) || bffNonFood.color != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffNonFood.color);
        }
        if (dVar.mo24897A(fVar, 2) || bffNonFood.shortDesignation != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffNonFood.shortDesignation);
        }
        if (dVar.mo24897A(fVar, 3) || bffNonFood.longDescription != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffNonFood.longDescription);
        }
        if (dVar.mo24897A(fVar, 4) || bffNonFood.typeOfCare != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffNonFood.typeOfCare);
        }
        if (dVar.mo24897A(fVar, 5) || bffNonFood.guarantee != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffNonFood.guarantee);
        }
        if (dVar.mo24897A(fVar, 6) || bffNonFood.energyClass != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffNonFood.energyClass);
        }
        if (dVar.mo24897A(fVar, 7) || bffNonFood.authorDirectorArtist != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffNonFood.authorDirectorArtist);
        }
        if (dVar.mo24897A(fVar, 8) || bffNonFood.summary != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffNonFood.summary);
        }
        if (dVar.mo24897A(fVar, 9) || bffNonFood.hairTypes != null) {
            dVar.mo24912i(fVar, 9, gVarArr[9], bffNonFood.hairTypes);
        }
        if (dVar.mo24897A(fVar, 10) || bffNonFood.productProperties != null) {
            dVar.mo24912i(fVar, 10, gVarArr[10], bffNonFood.productProperties);
        }
        if (dVar.mo24897A(fVar, 11) || bffNonFood.productTreatmentList != null) {
            dVar.mo24912i(fVar, 11, gVarArr[11], bffNonFood.productTreatmentList);
        }
        if (dVar.mo24897A(fVar, 12) || bffNonFood.productUsage != null) {
            dVar.mo24912i(fVar, 12, gVarArr[12], bffNonFood.productUsage);
        }
        if (dVar.mo24897A(fVar, 13) || bffNonFood.skinType != null) {
            dVar.mo24912i(fVar, 13, gVarArr[13], bffNonFood.skinType);
        }
        if (dVar.mo24897A(fVar, 14) || bffNonFood.solarProtectionEfficiency != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffNonFood.solarProtectionEfficiency);
        }
        if (dVar.mo24897A(fVar, 15) || bffNonFood.sunBurnProtectionFactor != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffNonFood.sunBurnProtectionFactor);
        }
        if (dVar.mo24897A(fVar, 16) || bffNonFood.productTexture != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffNonFood.productTexture);
        }
        if (dVar.mo24897A(fVar, 17) || bffNonFood.compatibleModelsAndBrands != null) {
            dVar.mo24912i(fVar, 17, gVarArr[17], bffNonFood.compatibleModelsAndBrands);
        }
        if (dVar.mo24897A(fVar, 18) || bffNonFood.dimensions != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffNonFood.dimensions);
        }
        if (dVar.mo24897A(fVar, 19) || bffNonFood.linenTreatment != null) {
            dVar.mo24912i(fVar, 19, gVarArr[19], bffNonFood.linenTreatment);
        }
        if (dVar.mo24897A(fVar, 20) || bffNonFood.audioLanguage != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffNonFood.audioLanguage);
        }
        if (dVar.mo24897A(fVar, 21) || bffNonFood.subtitleLanguage != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffNonFood.subtitleLanguage);
        }
        if (dVar.mo24897A(fVar, 22) || bffNonFood.releaseDate != null) {
            dVar.mo24912i(fVar, 22, C12310s1.f30117a, bffNonFood.releaseDate);
        }
        if (dVar.mo24897A(fVar, 23) || bffNonFood.mediaFormat != null) {
            dVar.mo24912i(fVar, 23, gVarArr[23], bffNonFood.mediaFormat);
        }
        if (dVar.mo24897A(fVar, 24) || bffNonFood.dogSize != null) {
            dVar.mo24912i(fVar, 24, C12310s1.f30117a, bffNonFood.dogSize);
        }
        if (dVar.mo24897A(fVar, 25) || bffNonFood.typeOfMemoryCards != null) {
            dVar.mo24912i(fVar, 25, gVarArr[25], bffNonFood.typeOfMemoryCards);
        }
        if (dVar.mo24897A(fVar, 26) || bffNonFood.wirelessConnection != null) {
            dVar.mo24912i(fVar, 26, gVarArr[26], bffNonFood.wirelessConnection);
        }
        if (dVar.mo24897A(fVar, 27) || bffNonFood.bladesNumber != null) {
            dVar.mo24912i(fVar, 27, C12311t.f30119a, bffNonFood.bladesNumber);
        }
        if (dVar.mo24897A(fVar, 28) || bffNonFood.powerSourceType != null) {
            dVar.mo24912i(fVar, 28, gVarArr[28], bffNonFood.powerSourceType);
        }
        if (dVar.mo24897A(fVar, 29) || bffNonFood.animalBreed != null) {
            dVar.mo24912i(fVar, 29, C12310s1.f30117a, bffNonFood.animalBreed);
        }
        if (dVar.mo24897A(fVar, 30) || bffNonFood.typeOfLighting != null) {
            dVar.mo24912i(fVar, 30, C12310s1.f30117a, bffNonFood.typeOfLighting);
        }
        if (dVar.mo24897A(fVar, 31) || bffNonFood.endedLightBulbType != null) {
            dVar.mo24912i(fVar, 31, C12310s1.f30117a, bffNonFood.endedLightBulbType);
        }
        if (dVar.mo24897A(fVar, 32) || bffNonFood.lightBulbType != null) {
            dVar.mo24912i(fVar, 32, C12310s1.f30117a, bffNonFood.lightBulbType);
        }
        if (dVar.mo24897A(fVar, 33) || bffNonFood.batteryType != null) {
            dVar.mo24912i(fVar, 33, C12310s1.f30117a, bffNonFood.batteryType);
        }
        if (dVar.mo24897A(fVar, 34) || bffNonFood.electricalPower != null) {
            dVar.mo24912i(fVar, 34, C12312t0.f30121a, bffNonFood.electricalPower);
        }
        if (dVar.mo24897A(fVar, 35) || bffNonFood.textileSize != null) {
            dVar.mo24912i(fVar, 35, C12310s1.f30117a, bffNonFood.textileSize);
        }
        if (dVar.mo24897A(fVar, 36) || bffNonFood.marketingAllegations != null) {
            dVar.mo24912i(fVar, 36, C12310s1.f30117a, bffNonFood.marketingAllegations);
        }
        if (dVar.mo24897A(fVar, 37) || bffNonFood.taxMessage != null) {
            dVar.mo24912i(fVar, 37, C12310s1.f30117a, bffNonFood.taxMessage);
        }
        if (dVar.mo24897A(fVar, 38) || bffNonFood.brandCompatibility != null) {
            dVar.mo24912i(fVar, 38, C12310s1.f30117a, bffNonFood.brandCompatibility);
        }
        if (dVar.mo24897A(fVar, 39) || bffNonFood.modelCompatibility != null) {
            dVar.mo24912i(fVar, 39, C12310s1.f30117a, bffNonFood.modelCompatibility);
        }
        if (dVar.mo24897A(fVar, 40) || bffNonFood.pillowShape != null) {
            dVar.mo24912i(fVar, 40, C12310s1.f30117a, bffNonFood.pillowShape);
        }
        if (dVar.mo24897A(fVar, 41) || bffNonFood.grPerM2 != null) {
            dVar.mo24912i(fVar, 41, C12310s1.f30117a, bffNonFood.grPerM2);
        }
        if (dVar.mo24897A(fVar, 42) || bffNonFood.quireType != null) {
            dVar.mo24912i(fVar, 42, C12310s1.f30117a, bffNonFood.quireType);
        }
        if (dVar.mo24897A(fVar, 43) || bffNonFood.diapersSize != null) {
            dVar.mo24912i(fVar, 43, C12310s1.f30117a, bffNonFood.diapersSize);
        }
        if (dVar.mo24897A(fVar, 44) || bffNonFood.diapersNumber != null) {
            dVar.mo24912i(fVar, 44, C12310s1.f30117a, bffNonFood.diapersNumber);
        }
        if (dVar.mo24897A(fVar, 45) || bffNonFood.nailType != null) {
            dVar.mo24912i(fVar, 45, C12310s1.f30117a, bffNonFood.nailType);
        }
        if (dVar.mo24897A(fVar, 46) || bffNonFood.careProductType != null) {
            dVar.mo24912i(fVar, 46, C12310s1.f30117a, bffNonFood.careProductType);
        }
        if (dVar.mo24897A(fVar, 47) || bffNonFood.washableDiapersType != null) {
            dVar.mo24912i(fVar, 47, C12310s1.f30117a, bffNonFood.washableDiapersType);
        }
        if (dVar.mo24897A(fVar, 48) || bffNonFood.isTestedOnAnimals != null) {
            dVar.mo24912i(fVar, 48, C12278i.f30070a, bffNonFood.isTestedOnAnimals);
        }
        if (dVar.mo24897A(fVar, 49) || bffNonFood.isRechargeable != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 49, C12278i.f30070a, bffNonFood.isRechargeable);
        }
    }

    @C12580l
    public final Long component1() {
        return this.volumeCapacity;
    }

    @C12580l
    public final List<String> component10() {
        return this.hairTypes;
    }

    @C12580l
    public final List<String> component11() {
        return this.productProperties;
    }

    @C12580l
    public final List<String> component12() {
        return this.productTreatmentList;
    }

    @C12580l
    public final List<String> component13() {
        return this.productUsage;
    }

    @C12580l
    public final List<String> component14() {
        return this.skinType;
    }

    @C12580l
    public final String component15() {
        return this.solarProtectionEfficiency;
    }

    @C12580l
    public final String component16() {
        return this.sunBurnProtectionFactor;
    }

    @C12580l
    public final String component17() {
        return this.productTexture;
    }

    @C12580l
    public final List<String> component18() {
        return this.compatibleModelsAndBrands;
    }

    @C12580l
    public final String component19() {
        return this.dimensions;
    }

    @C12580l
    public final String component2() {
        return this.color;
    }

    @C12580l
    public final List<String> component20() {
        return this.linenTreatment;
    }

    @C12580l
    public final String component21() {
        return this.audioLanguage;
    }

    @C12580l
    public final String component22() {
        return this.subtitleLanguage;
    }

    @C12580l
    public final String component23() {
        return this.releaseDate;
    }

    @C12580l
    public final List<String> component24() {
        return this.mediaFormat;
    }

    @C12580l
    public final String component25() {
        return this.dogSize;
    }

    @C12580l
    public final List<String> component26() {
        return this.typeOfMemoryCards;
    }

    @C12580l
    public final List<String> component27() {
        return this.wirelessConnection;
    }

    @C12580l
    public final Double component28() {
        return this.bladesNumber;
    }

    @C12580l
    public final List<String> component29() {
        return this.powerSourceType;
    }

    @C12580l
    public final String component3() {
        return this.shortDesignation;
    }

    @C12580l
    public final String component30() {
        return this.animalBreed;
    }

    @C12580l
    public final String component31() {
        return this.typeOfLighting;
    }

    @C12580l
    public final String component32() {
        return this.endedLightBulbType;
    }

    @C12580l
    public final String component33() {
        return this.lightBulbType;
    }

    @C12580l
    public final String component34() {
        return this.batteryType;
    }

    @C12580l
    public final Long component35() {
        return this.electricalPower;
    }

    @C12580l
    public final String component36() {
        return this.textileSize;
    }

    @C12580l
    public final String component37() {
        return this.marketingAllegations;
    }

    @C12580l
    public final String component38() {
        return this.taxMessage;
    }

    @C12580l
    public final String component39() {
        return this.brandCompatibility;
    }

    @C12580l
    public final String component4() {
        return this.longDescription;
    }

    @C12580l
    public final String component40() {
        return this.modelCompatibility;
    }

    @C12580l
    public final String component41() {
        return this.pillowShape;
    }

    @C12580l
    public final String component42() {
        return this.grPerM2;
    }

    @C12580l
    public final String component43() {
        return this.quireType;
    }

    @C12580l
    public final String component44() {
        return this.diapersSize;
    }

    @C12580l
    public final String component45() {
        return this.diapersNumber;
    }

    @C12580l
    public final String component46() {
        return this.nailType;
    }

    @C12580l
    public final String component47() {
        return this.careProductType;
    }

    @C12580l
    public final String component48() {
        return this.washableDiapersType;
    }

    @C12580l
    public final Boolean component49() {
        return this.isTestedOnAnimals;
    }

    @C12580l
    public final String component5() {
        return this.typeOfCare;
    }

    @C12580l
    public final Boolean component50() {
        return this.isRechargeable;
    }

    @C12580l
    public final String component6() {
        return this.guarantee;
    }

    @C12580l
    public final String component7() {
        return this.energyClass;
    }

    @C12580l
    public final String component8() {
        return this.authorDirectorArtist;
    }

    @C12580l
    public final String component9() {
        return this.summary;
    }

    @C12579k
    public final BffNonFood copy(@C12580l Long l, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l List<String> list, @C12580l List<String> list2, @C12580l List<String> list3, @C12580l List<String> list4, @C12580l List<String> list5, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l List<String> list6, @C12580l String str12, @C12580l List<String> list7, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l List<String> list8, @C12580l String str16, @C12580l List<String> list9, @C12580l List<String> list10, @C12580l Double d, @C12580l List<String> list11, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l Long l2, @C12580l String str22, @C12580l String str23, @C12580l String str24, @C12580l String str25, @C12580l String str26, @C12580l String str27, @C12580l String str28, @C12580l String str29, @C12580l String str30, @C12580l String str31, @C12580l String str32, @C12580l String str33, @C12580l String str34, @C12580l Boolean bool, @C12580l Boolean bool2) {
        return new BffNonFood(l, str, str2, str3, str4, str5, str6, str7, str8, list, list2, list3, list4, list5, str9, str10, str11, list6, str12, list7, str13, str14, str15, list8, str16, list9, list10, d, list11, str17, str18, str19, str20, str21, l2, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, bool, bool2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffNonFood)) {
            return false;
        }
        BffNonFood bffNonFood = (BffNonFood) obj;
        return Intrinsics.areEqual((Object) this.volumeCapacity, (Object) bffNonFood.volumeCapacity) && Intrinsics.areEqual((Object) this.color, (Object) bffNonFood.color) && Intrinsics.areEqual((Object) this.shortDesignation, (Object) bffNonFood.shortDesignation) && Intrinsics.areEqual((Object) this.longDescription, (Object) bffNonFood.longDescription) && Intrinsics.areEqual((Object) this.typeOfCare, (Object) bffNonFood.typeOfCare) && Intrinsics.areEqual((Object) this.guarantee, (Object) bffNonFood.guarantee) && Intrinsics.areEqual((Object) this.energyClass, (Object) bffNonFood.energyClass) && Intrinsics.areEqual((Object) this.authorDirectorArtist, (Object) bffNonFood.authorDirectorArtist) && Intrinsics.areEqual((Object) this.summary, (Object) bffNonFood.summary) && Intrinsics.areEqual((Object) this.hairTypes, (Object) bffNonFood.hairTypes) && Intrinsics.areEqual((Object) this.productProperties, (Object) bffNonFood.productProperties) && Intrinsics.areEqual((Object) this.productTreatmentList, (Object) bffNonFood.productTreatmentList) && Intrinsics.areEqual((Object) this.productUsage, (Object) bffNonFood.productUsage) && Intrinsics.areEqual((Object) this.skinType, (Object) bffNonFood.skinType) && Intrinsics.areEqual((Object) this.solarProtectionEfficiency, (Object) bffNonFood.solarProtectionEfficiency) && Intrinsics.areEqual((Object) this.sunBurnProtectionFactor, (Object) bffNonFood.sunBurnProtectionFactor) && Intrinsics.areEqual((Object) this.productTexture, (Object) bffNonFood.productTexture) && Intrinsics.areEqual((Object) this.compatibleModelsAndBrands, (Object) bffNonFood.compatibleModelsAndBrands) && Intrinsics.areEqual((Object) this.dimensions, (Object) bffNonFood.dimensions) && Intrinsics.areEqual((Object) this.linenTreatment, (Object) bffNonFood.linenTreatment) && Intrinsics.areEqual((Object) this.audioLanguage, (Object) bffNonFood.audioLanguage) && Intrinsics.areEqual((Object) this.subtitleLanguage, (Object) bffNonFood.subtitleLanguage) && Intrinsics.areEqual((Object) this.releaseDate, (Object) bffNonFood.releaseDate) && Intrinsics.areEqual((Object) this.mediaFormat, (Object) bffNonFood.mediaFormat) && Intrinsics.areEqual((Object) this.dogSize, (Object) bffNonFood.dogSize) && Intrinsics.areEqual((Object) this.typeOfMemoryCards, (Object) bffNonFood.typeOfMemoryCards) && Intrinsics.areEqual((Object) this.wirelessConnection, (Object) bffNonFood.wirelessConnection) && Intrinsics.areEqual((Object) this.bladesNumber, (Object) bffNonFood.bladesNumber) && Intrinsics.areEqual((Object) this.powerSourceType, (Object) bffNonFood.powerSourceType) && Intrinsics.areEqual((Object) this.animalBreed, (Object) bffNonFood.animalBreed) && Intrinsics.areEqual((Object) this.typeOfLighting, (Object) bffNonFood.typeOfLighting) && Intrinsics.areEqual((Object) this.endedLightBulbType, (Object) bffNonFood.endedLightBulbType) && Intrinsics.areEqual((Object) this.lightBulbType, (Object) bffNonFood.lightBulbType) && Intrinsics.areEqual((Object) this.batteryType, (Object) bffNonFood.batteryType) && Intrinsics.areEqual((Object) this.electricalPower, (Object) bffNonFood.electricalPower) && Intrinsics.areEqual((Object) this.textileSize, (Object) bffNonFood.textileSize) && Intrinsics.areEqual((Object) this.marketingAllegations, (Object) bffNonFood.marketingAllegations) && Intrinsics.areEqual((Object) this.taxMessage, (Object) bffNonFood.taxMessage) && Intrinsics.areEqual((Object) this.brandCompatibility, (Object) bffNonFood.brandCompatibility) && Intrinsics.areEqual((Object) this.modelCompatibility, (Object) bffNonFood.modelCompatibility) && Intrinsics.areEqual((Object) this.pillowShape, (Object) bffNonFood.pillowShape) && Intrinsics.areEqual((Object) this.grPerM2, (Object) bffNonFood.grPerM2) && Intrinsics.areEqual((Object) this.quireType, (Object) bffNonFood.quireType) && Intrinsics.areEqual((Object) this.diapersSize, (Object) bffNonFood.diapersSize) && Intrinsics.areEqual((Object) this.diapersNumber, (Object) bffNonFood.diapersNumber) && Intrinsics.areEqual((Object) this.nailType, (Object) bffNonFood.nailType) && Intrinsics.areEqual((Object) this.careProductType, (Object) bffNonFood.careProductType) && Intrinsics.areEqual((Object) this.washableDiapersType, (Object) bffNonFood.washableDiapersType) && Intrinsics.areEqual((Object) this.isTestedOnAnimals, (Object) bffNonFood.isTestedOnAnimals) && Intrinsics.areEqual((Object) this.isRechargeable, (Object) bffNonFood.isRechargeable);
    }

    @C12580l
    public final String getAnimalBreed() {
        return this.animalBreed;
    }

    @C12580l
    public final String getAudioLanguage() {
        return this.audioLanguage;
    }

    @C12580l
    public final String getAuthorDirectorArtist() {
        return this.authorDirectorArtist;
    }

    @C12580l
    public final String getBatteryType() {
        return this.batteryType;
    }

    @C12580l
    public final Double getBladesNumber() {
        return this.bladesNumber;
    }

    @C12580l
    public final String getBrandCompatibility() {
        return this.brandCompatibility;
    }

    @C12580l
    public final String getCareProductType() {
        return this.careProductType;
    }

    @C12580l
    public final String getColor() {
        return this.color;
    }

    @C12580l
    public final List<String> getCompatibleModelsAndBrands() {
        return this.compatibleModelsAndBrands;
    }

    @C12580l
    public final String getDiapersNumber() {
        return this.diapersNumber;
    }

    @C12580l
    public final String getDiapersSize() {
        return this.diapersSize;
    }

    @C12580l
    public final String getDimensions() {
        return this.dimensions;
    }

    @C12580l
    public final String getDogSize() {
        return this.dogSize;
    }

    @C12580l
    public final Long getElectricalPower() {
        return this.electricalPower;
    }

    @C12580l
    public final String getEndedLightBulbType() {
        return this.endedLightBulbType;
    }

    @C12580l
    public final String getEnergyClass() {
        return this.energyClass;
    }

    @C12580l
    public final String getGrPerM2() {
        return this.grPerM2;
    }

    @C12580l
    public final String getGuarantee() {
        return this.guarantee;
    }

    @C12580l
    public final List<String> getHairTypes() {
        return this.hairTypes;
    }

    @C12580l
    public final String getLightBulbType() {
        return this.lightBulbType;
    }

    @C12580l
    public final List<String> getLinenTreatment() {
        return this.linenTreatment;
    }

    @C12580l
    public final String getLongDescription() {
        return this.longDescription;
    }

    @C12580l
    public final String getMarketingAllegations() {
        return this.marketingAllegations;
    }

    @C12580l
    public final List<String> getMediaFormat() {
        return this.mediaFormat;
    }

    @C12580l
    public final String getModelCompatibility() {
        return this.modelCompatibility;
    }

    @C12580l
    public final String getNailType() {
        return this.nailType;
    }

    @C12580l
    public final String getPillowShape() {
        return this.pillowShape;
    }

    @C12580l
    public final List<String> getPowerSourceType() {
        return this.powerSourceType;
    }

    @C12580l
    public final List<String> getProductProperties() {
        return this.productProperties;
    }

    @C12580l
    public final String getProductTexture() {
        return this.productTexture;
    }

    @C12580l
    public final List<String> getProductTreatmentList() {
        return this.productTreatmentList;
    }

    @C12580l
    public final List<String> getProductUsage() {
        return this.productUsage;
    }

    @C12580l
    public final String getQuireType() {
        return this.quireType;
    }

    @C12580l
    public final String getReleaseDate() {
        return this.releaseDate;
    }

    @C12580l
    public final String getShortDesignation() {
        return this.shortDesignation;
    }

    @C12580l
    public final List<String> getSkinType() {
        return this.skinType;
    }

    @C12580l
    public final String getSolarProtectionEfficiency() {
        return this.solarProtectionEfficiency;
    }

    @C12580l
    public final String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    @C12580l
    public final String getSummary() {
        return this.summary;
    }

    @C12580l
    public final String getSunBurnProtectionFactor() {
        return this.sunBurnProtectionFactor;
    }

    @C12580l
    public final String getTaxMessage() {
        return this.taxMessage;
    }

    @C12580l
    public final String getTextileSize() {
        return this.textileSize;
    }

    @C12580l
    public final String getTypeOfCare() {
        return this.typeOfCare;
    }

    @C12580l
    public final String getTypeOfLighting() {
        return this.typeOfLighting;
    }

    @C12580l
    public final List<String> getTypeOfMemoryCards() {
        return this.typeOfMemoryCards;
    }

    @C12580l
    public final Long getVolumeCapacity() {
        return this.volumeCapacity;
    }

    @C12580l
    public final String getWashableDiapersType() {
        return this.washableDiapersType;
    }

    @C12580l
    public final List<String> getWirelessConnection() {
        return this.wirelessConnection;
    }

    public int hashCode() {
        Long l = this.volumeCapacity;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shortDesignation;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longDescription;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.typeOfCare;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.guarantee;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.energyClass;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.authorDirectorArtist;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.summary;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.hairTypes;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.productProperties;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.productTreatmentList;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.productUsage;
        int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.skinType;
        int hashCode14 = (hashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str9 = this.solarProtectionEfficiency;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sunBurnProtectionFactor;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.productTexture;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list6 = this.compatibleModelsAndBrands;
        int hashCode18 = (hashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str12 = this.dimensions;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list7 = this.linenTreatment;
        int hashCode20 = (hashCode19 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str13 = this.audioLanguage;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.subtitleLanguage;
        int hashCode22 = (hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.releaseDate;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<String> list8 = this.mediaFormat;
        int hashCode24 = (hashCode23 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str16 = this.dogSize;
        int hashCode25 = (hashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List<String> list9 = this.typeOfMemoryCards;
        int hashCode26 = (hashCode25 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.wirelessConnection;
        int hashCode27 = (hashCode26 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Double d = this.bladesNumber;
        int hashCode28 = (hashCode27 + (d == null ? 0 : d.hashCode())) * 31;
        List<String> list11 = this.powerSourceType;
        int hashCode29 = (hashCode28 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str17 = this.animalBreed;
        int hashCode30 = (hashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.typeOfLighting;
        int hashCode31 = (hashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.endedLightBulbType;
        int hashCode32 = (hashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.lightBulbType;
        int hashCode33 = (hashCode32 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.batteryType;
        int hashCode34 = (hashCode33 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Long l2 = this.electricalPower;
        int hashCode35 = (hashCode34 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str22 = this.textileSize;
        int hashCode36 = (hashCode35 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.marketingAllegations;
        int hashCode37 = (hashCode36 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.taxMessage;
        int hashCode38 = (hashCode37 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.brandCompatibility;
        int hashCode39 = (hashCode38 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.modelCompatibility;
        int hashCode40 = (hashCode39 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.pillowShape;
        int hashCode41 = (hashCode40 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.grPerM2;
        int hashCode42 = (hashCode41 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.quireType;
        int hashCode43 = (hashCode42 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.diapersSize;
        int hashCode44 = (hashCode43 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.diapersNumber;
        int hashCode45 = (hashCode44 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.nailType;
        int hashCode46 = (hashCode45 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.careProductType;
        int hashCode47 = (hashCode46 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.washableDiapersType;
        int hashCode48 = (hashCode47 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Boolean bool = this.isTestedOnAnimals;
        int hashCode49 = (hashCode48 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRechargeable;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode49 + i;
    }

    @C12580l
    public final Boolean isRechargeable() {
        return this.isRechargeable;
    }

    @C12580l
    public final Boolean isTestedOnAnimals() {
        return this.isTestedOnAnimals;
    }

    @C12579k
    public String toString() {
        Long l = this.volumeCapacity;
        String str = this.color;
        String str2 = this.shortDesignation;
        String str3 = this.longDescription;
        String str4 = this.typeOfCare;
        String str5 = this.guarantee;
        String str6 = this.energyClass;
        String str7 = this.authorDirectorArtist;
        String str8 = this.summary;
        List<String> list = this.hairTypes;
        List<String> list2 = this.productProperties;
        List<String> list3 = this.productTreatmentList;
        List<String> list4 = this.productUsage;
        List<String> list5 = this.skinType;
        String str9 = this.solarProtectionEfficiency;
        String str10 = this.sunBurnProtectionFactor;
        String str11 = this.productTexture;
        List<String> list6 = this.compatibleModelsAndBrands;
        String str12 = this.dimensions;
        List<String> list7 = this.linenTreatment;
        String str13 = this.audioLanguage;
        String str14 = this.subtitleLanguage;
        String str15 = this.releaseDate;
        List<String> list8 = this.mediaFormat;
        String str16 = this.dogSize;
        List<String> list9 = this.typeOfMemoryCards;
        List<String> list10 = this.wirelessConnection;
        Double d = this.bladesNumber;
        List<String> list11 = this.powerSourceType;
        String str17 = this.animalBreed;
        String str18 = this.typeOfLighting;
        String str19 = this.endedLightBulbType;
        String str20 = this.lightBulbType;
        String str21 = this.batteryType;
        Long l2 = this.electricalPower;
        String str22 = this.textileSize;
        String str23 = this.marketingAllegations;
        String str24 = this.taxMessage;
        String str25 = this.brandCompatibility;
        String str26 = this.modelCompatibility;
        String str27 = this.pillowShape;
        String str28 = this.grPerM2;
        String str29 = this.quireType;
        String str30 = this.diapersSize;
        String str31 = this.diapersNumber;
        String str32 = this.nailType;
        String str33 = this.careProductType;
        String str34 = this.washableDiapersType;
        Boolean bool = this.isTestedOnAnimals;
        Boolean bool2 = this.isRechargeable;
        return "BffNonFood(volumeCapacity=" + l + ", color=" + str + ", shortDesignation=" + str2 + ", longDescription=" + str3 + ", typeOfCare=" + str4 + ", guarantee=" + str5 + ", energyClass=" + str6 + ", authorDirectorArtist=" + str7 + ", summary=" + str8 + ", hairTypes=" + list + ", productProperties=" + list2 + ", productTreatmentList=" + list3 + ", productUsage=" + list4 + ", skinType=" + list5 + ", solarProtectionEfficiency=" + str9 + ", sunBurnProtectionFactor=" + str10 + ", productTexture=" + str11 + ", compatibleModelsAndBrands=" + list6 + ", dimensions=" + str12 + ", linenTreatment=" + list7 + ", audioLanguage=" + str13 + ", subtitleLanguage=" + str14 + ", releaseDate=" + str15 + ", mediaFormat=" + list8 + ", dogSize=" + str16 + ", typeOfMemoryCards=" + list9 + ", wirelessConnection=" + list10 + ", bladesNumber=" + d + ", powerSourceType=" + list11 + ", animalBreed=" + str17 + ", typeOfLighting=" + str18 + ", endedLightBulbType=" + str19 + ", lightBulbType=" + str20 + ", batteryType=" + str21 + ", electricalPower=" + l2 + ", textileSize=" + str22 + ", marketingAllegations=" + str23 + ", taxMessage=" + str24 + ", brandCompatibility=" + str25 + ", modelCompatibility=" + str26 + ", pillowShape=" + str27 + ", grPerM2=" + str28 + ", quireType=" + str29 + ", diapersSize=" + str30 + ", diapersNumber=" + str31 + ", nailType=" + str32 + ", careProductType=" + str33 + ", washableDiapersType=" + str34 + ", isTestedOnAnimals=" + bool + ", isRechargeable=" + bool2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffNonFood(int i, int i2, @C12438n("volume_capacity") Long l, @C12438n("color") String str, @C12438n("short_designation") String str2, @C12438n("long_description") String str3, @C12438n("type_of_care") String str4, @C12438n("guarantee") String str5, @C12438n("energy_class") String str6, @C12438n("author_director_artist") String str7, @C12438n("summary") String str8, @C12438n("hair_types") List list, @C12438n("product_properties") List list2, @C12438n("product_treatment_list") List list3, @C12438n("product_usage") List list4, @C12438n("skin_type") List list5, @C12438n("solar_protection_efficiency") String str9, @C12438n("sun_burn_protection_factor") String str10, @C12438n("product_texture") String str11, @C12438n("compatible_models_and_brands") List list6, @C12438n("dimensions") String str12, @C12438n("linen_treatment") List list7, @C12438n("audio_language") String str13, @C12438n("subtitle_language") String str14, @C12438n("release_date") String str15, @C12438n("media_format") List list8, @C12438n("dog_size") String str16, @C12438n("type_of_memory_cards") List list9, @C12438n("wireless_connection") List list10, @C12438n("blades_number") Double d, @C12438n("power_source_type") List list11, @C12438n("animal_breed") String str17, @C12438n("type_of_lighting") String str18, @C12438n("ended_light_bulb_type") String str19, @C12438n("light_bulb_type") String str20, @C12438n("battery_type") String str21, @C12438n("electrical_power") Long l2, @C12438n("textile_size") String str22, @C12438n("marketing_allegations") String str23, @C12438n("tax_message") String str24, @C12438n("brand_compatibility") String str25, @C12438n("model_compatibility") String str26, @C12438n("pillow_shape") String str27, @C12438n("gr_per_m2") String str28, @C12438n("quire_type") String str29, @C12438n("diapers_size") String str30, @C12438n("diapers_number") String str31, @C12438n("nail_type") String str32, @C12438n("care_product_type") String str33, @C12438n("washable_diapers_type") String str34, @C12438n("is_tested_on_animals") Boolean bool, @C12438n("is_rechargeable") Boolean bool2, C12295n1 n1Var) {
        int i3 = i;
        int i4 = i2;
        if (((i3 & 0) != 0) || ((i4 & 0) != 0)) {
            C12261c1.m49255a(new int[]{i3, i4}, new int[]{0, 0}, BffNonFood$$serializer.INSTANCE.getDescriptor());
        }
        if ((i3 & 1) == 0) {
            this.volumeCapacity = null;
        } else {
            this.volumeCapacity = l;
        }
        if ((i3 & 2) == 0) {
            this.color = null;
        } else {
            this.color = str;
        }
        if ((i3 & 4) == 0) {
            this.shortDesignation = null;
        } else {
            this.shortDesignation = str2;
        }
        if ((i3 & 8) == 0) {
            this.longDescription = null;
        } else {
            this.longDescription = str3;
        }
        if ((i3 & 16) == 0) {
            this.typeOfCare = null;
        } else {
            this.typeOfCare = str4;
        }
        if ((i3 & 32) == 0) {
            this.guarantee = null;
        } else {
            this.guarantee = str5;
        }
        if ((i3 & 64) == 0) {
            this.energyClass = null;
        } else {
            this.energyClass = str6;
        }
        if ((i3 & 128) == 0) {
            this.authorDirectorArtist = null;
        } else {
            this.authorDirectorArtist = str7;
        }
        if ((i3 & 256) == 0) {
            this.summary = null;
        } else {
            this.summary = str8;
        }
        if ((i3 & 512) == 0) {
            this.hairTypes = null;
        } else {
            this.hairTypes = list;
        }
        if ((i3 & 1024) == 0) {
            this.productProperties = null;
        } else {
            this.productProperties = list2;
        }
        if ((i3 & 2048) == 0) {
            this.productTreatmentList = null;
        } else {
            this.productTreatmentList = list3;
        }
        if ((i3 & 4096) == 0) {
            this.productUsage = null;
        } else {
            this.productUsage = list4;
        }
        if ((i3 & 8192) == 0) {
            this.skinType = null;
        } else {
            this.skinType = list5;
        }
        if ((i3 & 16384) == 0) {
            this.solarProtectionEfficiency = null;
        } else {
            this.solarProtectionEfficiency = str9;
        }
        if ((i3 & 32768) == 0) {
            this.sunBurnProtectionFactor = null;
        } else {
            this.sunBurnProtectionFactor = str10;
        }
        if ((i3 & 65536) == 0) {
            this.productTexture = null;
        } else {
            this.productTexture = str11;
        }
        if ((i3 & 131072) == 0) {
            this.compatibleModelsAndBrands = null;
        } else {
            this.compatibleModelsAndBrands = list6;
        }
        if ((262144 & i3) == 0) {
            this.dimensions = null;
        } else {
            this.dimensions = str12;
        }
        if ((524288 & i3) == 0) {
            this.linenTreatment = null;
        } else {
            this.linenTreatment = list7;
        }
        if ((1048576 & i3) == 0) {
            this.audioLanguage = null;
        } else {
            this.audioLanguage = str13;
        }
        if ((2097152 & i3) == 0) {
            this.subtitleLanguage = null;
        } else {
            this.subtitleLanguage = str14;
        }
        if ((4194304 & i3) == 0) {
            this.releaseDate = null;
        } else {
            this.releaseDate = str15;
        }
        if ((8388608 & i3) == 0) {
            this.mediaFormat = null;
        } else {
            this.mediaFormat = list8;
        }
        if ((16777216 & i3) == 0) {
            this.dogSize = null;
        } else {
            this.dogSize = str16;
        }
        if ((33554432 & i3) == 0) {
            this.typeOfMemoryCards = null;
        } else {
            this.typeOfMemoryCards = list9;
        }
        if ((67108864 & i3) == 0) {
            this.wirelessConnection = null;
        } else {
            this.wirelessConnection = list10;
        }
        if ((134217728 & i3) == 0) {
            this.bladesNumber = null;
        } else {
            this.bladesNumber = d;
        }
        if ((268435456 & i3) == 0) {
            this.powerSourceType = null;
        } else {
            this.powerSourceType = list11;
        }
        if ((536870912 & i3) == 0) {
            this.animalBreed = null;
        } else {
            this.animalBreed = str17;
        }
        if ((1073741824 & i3) == 0) {
            this.typeOfLighting = null;
        } else {
            this.typeOfLighting = str18;
        }
        if ((i3 & Integer.MIN_VALUE) == 0) {
            this.endedLightBulbType = null;
        } else {
            this.endedLightBulbType = str19;
        }
        if ((i4 & 1) == 0) {
            this.lightBulbType = null;
        } else {
            this.lightBulbType = str20;
        }
        if ((i4 & 2) == 0) {
            this.batteryType = null;
        } else {
            this.batteryType = str21;
        }
        if ((i4 & 4) == 0) {
            this.electricalPower = null;
        } else {
            this.electricalPower = l2;
        }
        if ((i4 & 8) == 0) {
            this.textileSize = null;
        } else {
            this.textileSize = str22;
        }
        if ((i4 & 16) == 0) {
            this.marketingAllegations = null;
        } else {
            this.marketingAllegations = str23;
        }
        if ((i4 & 32) == 0) {
            this.taxMessage = null;
        } else {
            this.taxMessage = str24;
        }
        if ((i4 & 64) == 0) {
            this.brandCompatibility = null;
        } else {
            this.brandCompatibility = str25;
        }
        if ((i4 & 128) == 0) {
            this.modelCompatibility = null;
        } else {
            this.modelCompatibility = str26;
        }
        if ((i4 & 256) == 0) {
            this.pillowShape = null;
        } else {
            this.pillowShape = str27;
        }
        if ((i4 & 512) == 0) {
            this.grPerM2 = null;
        } else {
            this.grPerM2 = str28;
        }
        if ((i4 & 1024) == 0) {
            this.quireType = null;
        } else {
            this.quireType = str29;
        }
        if ((i4 & 2048) == 0) {
            this.diapersSize = null;
        } else {
            this.diapersSize = str30;
        }
        if ((i4 & 4096) == 0) {
            this.diapersNumber = null;
        } else {
            this.diapersNumber = str31;
        }
        if ((i4 & 8192) == 0) {
            this.nailType = null;
        } else {
            this.nailType = str32;
        }
        if ((i4 & 16384) == 0) {
            this.careProductType = null;
        } else {
            this.careProductType = str33;
        }
        if ((i4 & 32768) == 0) {
            this.washableDiapersType = null;
        } else {
            this.washableDiapersType = str34;
        }
        if ((i4 & 65536) == 0) {
            this.isTestedOnAnimals = null;
        } else {
            this.isTestedOnAnimals = bool;
        }
        if ((i4 & 131072) == 0) {
            this.isRechargeable = null;
        } else {
            this.isRechargeable = bool2;
        }
    }

    public BffNonFood(@C12580l Long l, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l List<String> list, @C12580l List<String> list2, @C12580l List<String> list3, @C12580l List<String> list4, @C12580l List<String> list5, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l List<String> list6, @C12580l String str12, @C12580l List<String> list7, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l List<String> list8, @C12580l String str16, @C12580l List<String> list9, @C12580l List<String> list10, @C12580l Double d, @C12580l List<String> list11, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l Long l2, @C12580l String str22, @C12580l String str23, @C12580l String str24, @C12580l String str25, @C12580l String str26, @C12580l String str27, @C12580l String str28, @C12580l String str29, @C12580l String str30, @C12580l String str31, @C12580l String str32, @C12580l String str33, @C12580l String str34, @C12580l Boolean bool, @C12580l Boolean bool2) {
        this.volumeCapacity = l;
        this.color = str;
        this.shortDesignation = str2;
        this.longDescription = str3;
        this.typeOfCare = str4;
        this.guarantee = str5;
        this.energyClass = str6;
        this.authorDirectorArtist = str7;
        this.summary = str8;
        this.hairTypes = list;
        this.productProperties = list2;
        this.productTreatmentList = list3;
        this.productUsage = list4;
        this.skinType = list5;
        this.solarProtectionEfficiency = str9;
        this.sunBurnProtectionFactor = str10;
        this.productTexture = str11;
        this.compatibleModelsAndBrands = list6;
        this.dimensions = str12;
        this.linenTreatment = list7;
        this.audioLanguage = str13;
        this.subtitleLanguage = str14;
        this.releaseDate = str15;
        this.mediaFormat = list8;
        this.dogSize = str16;
        this.typeOfMemoryCards = list9;
        this.wirelessConnection = list10;
        this.bladesNumber = d;
        this.powerSourceType = list11;
        this.animalBreed = str17;
        this.typeOfLighting = str18;
        this.endedLightBulbType = str19;
        this.lightBulbType = str20;
        this.batteryType = str21;
        this.electricalPower = l2;
        this.textileSize = str22;
        this.marketingAllegations = str23;
        this.taxMessage = str24;
        this.brandCompatibility = str25;
        this.modelCompatibility = str26;
        this.pillowShape = str27;
        this.grPerM2 = str28;
        this.quireType = str29;
        this.diapersSize = str30;
        this.diapersNumber = str31;
        this.nailType = str32;
        this.careProductType = str33;
        this.washableDiapersType = str34;
        this.isTestedOnAnimals = bool;
        this.isRechargeable = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffNonFood(java.lang.Long r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.util.List r60, java.util.List r61, java.util.List r62, java.util.List r63, java.util.List r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.util.List r68, java.lang.String r69, java.util.List r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.util.List r74, java.lang.String r75, java.util.List r76, java.util.List r77, java.lang.Double r78, java.util.List r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.Long r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.Boolean r99, java.lang.Boolean r100, int r101, int r102, kotlin.jvm.internal.DefaultConstructorMarker r103) {
        /*
            r50 = this;
            r0 = r101
            r1 = r102
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r51
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r52
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r53
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r54
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r55
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r56
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r57
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r58
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r59
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r60
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r61
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r62
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r63
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r64
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r65
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x0088
            r18 = 0
            goto L_0x008a
        L_0x0088:
            r18 = r66
        L_0x008a:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x0093
            r20 = 0
            goto L_0x0095
        L_0x0093:
            r20 = r67
        L_0x0095:
            r21 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r21
            if (r22 == 0) goto L_0x009e
            r22 = 0
            goto L_0x00a0
        L_0x009e:
            r22 = r68
        L_0x00a0:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00a9
            r23 = 0
            goto L_0x00ab
        L_0x00a9:
            r23 = r69
        L_0x00ab:
            r24 = 524288(0x80000, float:7.34684E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00b4
            r24 = 0
            goto L_0x00b6
        L_0x00b4:
            r24 = r70
        L_0x00b6:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00bf
            r25 = 0
            goto L_0x00c1
        L_0x00bf:
            r25 = r71
        L_0x00c1:
            r26 = 2097152(0x200000, float:2.938736E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00ca
            r26 = 0
            goto L_0x00cc
        L_0x00ca:
            r26 = r72
        L_0x00cc:
            r27 = 4194304(0x400000, float:5.877472E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00d5
            r27 = 0
            goto L_0x00d7
        L_0x00d5:
            r27 = r73
        L_0x00d7:
            r28 = 8388608(0x800000, float:1.17549435E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00e0
            r28 = 0
            goto L_0x00e2
        L_0x00e0:
            r28 = r74
        L_0x00e2:
            r29 = 16777216(0x1000000, float:2.3509887E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00eb
            r29 = 0
            goto L_0x00ed
        L_0x00eb:
            r29 = r75
        L_0x00ed:
            r30 = 33554432(0x2000000, float:9.403955E-38)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00f6
            r30 = 0
            goto L_0x00f8
        L_0x00f6:
            r30 = r76
        L_0x00f8:
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0101
            r31 = 0
            goto L_0x0103
        L_0x0101:
            r31 = r77
        L_0x0103:
            r32 = 134217728(0x8000000, float:3.85186E-34)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x010c
            r32 = 0
            goto L_0x010e
        L_0x010c:
            r32 = r78
        L_0x010e:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x0117
            r33 = 0
            goto L_0x0119
        L_0x0117:
            r33 = r79
        L_0x0119:
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0122
            r34 = 0
            goto L_0x0124
        L_0x0122:
            r34 = r80
        L_0x0124:
            r35 = 1073741824(0x40000000, float:2.0)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x012d
            r35 = 0
            goto L_0x012f
        L_0x012d:
            r35 = r81
        L_0x012f:
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r36
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r82
        L_0x0139:
            r36 = r1 & 1
            if (r36 == 0) goto L_0x0140
            r36 = 0
            goto L_0x0142
        L_0x0140:
            r36 = r83
        L_0x0142:
            r37 = r1 & 2
            if (r37 == 0) goto L_0x0149
            r37 = 0
            goto L_0x014b
        L_0x0149:
            r37 = r84
        L_0x014b:
            r38 = r1 & 4
            if (r38 == 0) goto L_0x0152
            r38 = 0
            goto L_0x0154
        L_0x0152:
            r38 = r85
        L_0x0154:
            r39 = r1 & 8
            if (r39 == 0) goto L_0x015b
            r39 = 0
            goto L_0x015d
        L_0x015b:
            r39 = r86
        L_0x015d:
            r40 = r1 & 16
            if (r40 == 0) goto L_0x0164
            r40 = 0
            goto L_0x0166
        L_0x0164:
            r40 = r87
        L_0x0166:
            r41 = r1 & 32
            if (r41 == 0) goto L_0x016d
            r41 = 0
            goto L_0x016f
        L_0x016d:
            r41 = r88
        L_0x016f:
            r42 = r1 & 64
            if (r42 == 0) goto L_0x0176
            r42 = 0
            goto L_0x0178
        L_0x0176:
            r42 = r89
        L_0x0178:
            r101 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            goto L_0x0182
        L_0x0180:
            r0 = r90
        L_0x0182:
            r43 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r91
        L_0x018c:
            r44 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0194
            r0 = 0
            goto L_0x0196
        L_0x0194:
            r0 = r92
        L_0x0196:
            r45 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x019e
            r0 = 0
            goto L_0x01a0
        L_0x019e:
            r0 = r93
        L_0x01a0:
            r46 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a8
            r0 = 0
            goto L_0x01aa
        L_0x01a8:
            r0 = r94
        L_0x01aa:
            r47 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01b4
        L_0x01b2:
            r0 = r95
        L_0x01b4:
            r48 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bc
            r0 = 0
            goto L_0x01be
        L_0x01bc:
            r0 = r96
        L_0x01be:
            r49 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01c6
            r0 = 0
            goto L_0x01c8
        L_0x01c6:
            r0 = r97
        L_0x01c8:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x01cf
            r17 = 0
            goto L_0x01d1
        L_0x01cf:
            r17 = r98
        L_0x01d1:
            r19 = r1 & r19
            if (r19 == 0) goto L_0x01d8
            r19 = 0
            goto L_0x01da
        L_0x01d8:
            r19 = r99
        L_0x01da:
            r1 = r1 & r21
            if (r1 == 0) goto L_0x01e0
            r1 = 0
            goto L_0x01e2
        L_0x01e0:
            r1 = r100
        L_0x01e2:
            r51 = r50
            r52 = r2
            r53 = r4
            r54 = r5
            r55 = r6
            r56 = r7
            r57 = r8
            r58 = r9
            r59 = r10
            r60 = r11
            r61 = r12
            r62 = r13
            r63 = r14
            r64 = r15
            r65 = r16
            r66 = r3
            r67 = r18
            r68 = r20
            r69 = r22
            r70 = r23
            r71 = r24
            r72 = r25
            r73 = r26
            r74 = r27
            r75 = r28
            r76 = r29
            r77 = r30
            r78 = r31
            r79 = r32
            r80 = r33
            r81 = r34
            r82 = r35
            r83 = r101
            r84 = r36
            r85 = r37
            r86 = r38
            r87 = r39
            r88 = r40
            r89 = r41
            r90 = r42
            r91 = r43
            r92 = r44
            r93 = r45
            r94 = r46
            r95 = r47
            r96 = r48
            r97 = r49
            r98 = r0
            r99 = r17
            r100 = r19
            r101 = r1
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffNonFood.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, java.lang.Double, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
