package ru.job4j.lambda;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getSize() - o2.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);
    }
}
