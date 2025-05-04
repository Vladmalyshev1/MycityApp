package com.example.mycityapp.data.repository

import com.example.mycityapp.R
import com.example.mycityapp.data.models.Place

sealed class Category(val name: String, val places: List<Place>) {
    object Restaurants : Category(
        "Рестораны",
        listOf(
            Place(
                "White Rabbit",
                "Ресторан с мишленовской звездой и панорамным видом на Москву.\n" +
                        "Адрес: ул. Смоленская, 3 (16 этаж)\n" +
                        "Часы работы: 12:00 - 00:00\n" +
                        "Телефон: +7 (495) 510-51-01",
                R.drawable.restaurant_white_rabbit
            ),
            Place(
                "Twins Garden",
                "Авторская кухня от братьев Березуцких. 2 мишленовские звезды.\n" +
                        "Адрес: ул. Страстной бульвар, 8/1\n" +
                        "Часы работы: 12:00 - 23:00\n" +
                        "Телефон: +7 (495) 363-40-36",
                R.drawable.restaurant_twins
            ),
            Place(
                "Сахалин",
                "Лучшие морепродукты и рыба с Дальнего Востока.\n" +
                        "Адрес: ул. Сретенка, 15\n" +
                        "Часы работы: 12:00 - 00:00\n" +
                        "Телефон: +7 (495) 623-27-27",
                R.drawable.restaurant_sakhalin
            )
        )
    )

    object Cafes : Category(
        "Кофейни",
        listOf(
            Place(
                "Double B",
                "Топовая кофейня с обжаркой зерен и десертами.\n" +
                        "Адрес: ул. Тверская, 7\n" +
                        "Часы работы: 08:00 - 22:00\n" +
                        "Телефон: +7 (495) 123-45-67",
                R.drawable.cafe_double_b
            ),
            Place(
                "Кофемания",
                "Сеть кофеен с завтраками и бизнес-ланчами.\n" +
                        "Адрес: ул. Новый Арбат, 11\n" +
                        "Часы работы: 08:00 - 23:00\n" +
                        "Телефон: +7 (495) 987-65-43",
                R.drawable.cafe_coffeemania
            ),
            Place(
                "Черная Овечка",
                "Авторский кофе и уютная атмосфера.\n" +
                        "Адрес: ул. Покровка, 18\n" +
                        "Часы работы: 09:00 - 21:00\n" +
                        "Телефон: +7 (495) 555-12-34",
                R.drawable.cafe_black_sheep
            )
        )
    )

    object Malls : Category(
        "Торговые центры",
        listOf(
            Place(
                "Авиапарк",
                "Крупнейший ТЦ в Европе с аквариумом и ледовой ареной.\n" +
                        "Адрес: Ходынский бульвар, 4\n" +
                        "Часы работы: 10:00 - 22:00",
                R.drawable.mall_aviapark
            ),
            Place(
                "Европейский",
                "ТЦ на площади Киевского вокзала с фуд-кортом.\n" +
                        "Адрес: пл. Киевского Вокзала, 2\n" +
                        "Часы работы: 10:00 - 22:00",
                R.drawable.mall_evropeyskiy
            ),
            Place(
                "Метрополис",
                "ТЦ с кинотеатром и детскими развлечениями.\n" +
                        "Адрес: Ленинградское ш., 16А\n" +
                        "Часы работы: 10:00 - 22:00",
                R.drawable.mall_metropolis
            )
        )
    )
}