//package com.example.healths;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//
//public class Util {
//    private static int ID = 0;
//
//    private static final String ALL_ITEM_KEY = "all_items";
//    private static final String DB_NAE = "fake_database";
//    private static final Gson gson = new Gson();
//    private static final Type breakfastListType = new TypeToken<ArrayList<BreakFast>>() {
//    }.getType();
//
////    public static void initSharedPreference(Context context) {
////        SharedPreferences sharedPreferences = context.getSharedPreferences(DB_NAE, Context.MODE_PRIVATE);
////        ArrayList<BreakFast> allItem = gson.fromJson(sharedPreferences.getString(ALL_ITEM_KEY, null), breakfastListType);
//////        if (null == allItem) {
//////            initAllItems(context);
//////        }
////    }
//
////    private static void initAllItems(Context context) {
////        ArrayList<BreakFast> allItems = new ArrayList<>();
////        BreakFast Egg = new BreakFast("g",
////                "Good For");
////        allItems.add(Egg);
////
////        SharedPreferences sharedPreferences = context.getSharedPreferences(DB_NAE, Context.MODE_MULTI_PROCESS);
////        SharedPreferences.Editor editor = sharedPreferences.edit();
////        editor.putString(ALL_ITEM_KEY, gson.toJson(allItems));
////        editor.apply();
////    }
//
//    public static ArrayList<BreakFast> getAllItems(Context context) {
////        SharedPreferences sharedPreferences = context.getSharedPreferences(DB_NAE,Context.MODE_MULTI_PROCESS);
////        ArrayList<BreakFast> allItem = gson.fromJson(sharedPreferences.getString(ALL_ITEM_KEY, null), breakfastListType);
//        return (ArrayList<BreakFast>) BreakFastDataBase.getInstance(context).breakfastDao().getAllData();
//    }
//
//    public static int getID() {
//        ID++;
//        return ID;
//    }
//}
