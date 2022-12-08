package de.tr7zw.changeme.nbtapi.iface;

import java.util.function.Predicate;

public interface ReadWriteNBTCompoundList extends ReadableNBTList<ReadWriteNBT> {

    ReadWriteNBT addCompound();

    ReadWriteNBT remove(int i);

    void clear();

    boolean removeIf(Predicate<? super ReadWriteNBT> pred);

}