package com.tanuj.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class ListUt {

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<>();
		List<List<Integer>> listBatch = ListUtils.partition(st, 8);
		listBatch.stream().forEach(pt -> {
			System.out.println(pt.size());
		});
		System.out.println(listBatch);

	}

}
