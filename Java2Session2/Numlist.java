package Java2Session2;

public class NumList {
public static <T> void copy (List <? super T> destObj, List <?
extends T> srcObj) {
for (int ctr=0; ctr<srcObj.size() ; ctr++) {
destObj.set(ctr, srcObj.get(ctr));
}
}
}