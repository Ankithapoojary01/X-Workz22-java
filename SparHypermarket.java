class SparHypermarket {
	public static void main(String[] items){
		String cosmetics[]={"Face Wash","Moisturizer","Sunscreen","Lip Balm","Lipstick","Foundation","Compact","Blush","Eyeliner","Kajal","Mascara","Serum","Face Cream","Night Cream","Sheet Mask","Perfume","Deodorant","Nail Polish","Remover","Hair Gel","Hair Spray","Face Scrub","Toner","Primer","Concealer"};
		String toiletries[]={"Soap","Shampoo","Conditioner","Toothpaste","Toothbrush","Mouthwash","Face Towel","Hand Wash","Body Wash","Shaving Cream","Razor","After Shave","Hair Oil","Body Lotion","Hand Cream","Foot Cream","Face Mask","Cotton","Ear Buds","Sanitary Pads","Tissues","Wet Wipes","Toilet Paper","Bath Sponge","Comb"};
		String cleaningItems []={"Detergent","Washing Powder","Dishwash Liquid","Floor Cleaner","Toilet Cleaner","Phenyl","Bleach","Glass Cleaner","Scrubber","Soap","Hand Wash","Disinfectant","Mop","Broom","Bucket","Dustbin","Wiper","Cleaning Cloth","Brush","Sponge","Garbage Bags","Room Freshener","Insect Spray","Sanitizer","Surface Cleaner"};
		String kitchenItems[]={"Plate","Bowl","Spoon","Fork","Knife","Pan","Tawa","Pressure Cooker","Kettle","Glass","Mug","Lunch Box","Water Bottle","Container","Chopping Board","Peeler","Strainer","Ladle","Spatula","Tray","Thermos","Grater","Rolling Pin","Whisk","Colander"};
		String stationery[]={"Pen","Pencil","Eraser","Sharpener","Notebook","Diary","Sketch Pen","Marker","Highlighter","Scale","Compass","Protractor","Glue","Stapler","Staples","File","Folder","Calculator","Sticky Notes","Paper Clips","White Board","Chart Paper","Color Pencils","Crayons","Brush"};
		String toys[]={"Teddy Bear","Toy Car","Doll","Puzzle","Board Game","Remote Car","Robot","Blocks","Ball","Bat","Frisbee","YoYo","Skipping Rope","Soft Toy","Train Set","Helicopter","Lego","Toy Gun","Kitchen Set","Doctor Set","Musical Toy","Story Book","Animal Toy","Educational Toy","Building Blocks"};
		String electronics[]={"Bulb","Tube Light","Switch","Socket","Charger","USB Cable","Power Bank","Headphones","Earphones","Speaker","Torch","Table Lamp","Emergency Light","Adapter","Battery","Remote","Clock","Calculator","Electric Kettle","Iron Box","Mixer","Fan","Heater","Hair Dryer","Extension Box"};
		String meatItems[]={"Chicken","Mutton","Fish","Prawns","Crab","Eggs","Sausage","Salami","Bacon","Ham","Minced Meat","Chicken Wings","Chicken Breast","Chicken Leg","Fish Fillet","Dry Fish","Frozen Meat","Seafood Mix","Turkey","Duck","Quail","Lobster","Squid","Clams","Oysters"};
		String babyItems[]={"Diapers","Baby Wipes","Baby Soap","Baby Shampoo","Baby Oil","Baby Lotion","Baby Powder","Feeding Bottle","Pacifier","Teether","Baby Cream","Rash Cream","Baby Towel","Baby Clothes","Baby Blanket","Baby Toys","Baby Food","Baby Cereal","Baby Juice","Baby Bath Tub","Baby Nail Cutter","Baby Comb","Baby Bib","Baby Pillow","Baby Mosquito Net"};
		String petItems[]={"Dog Food","Cat Food","Pet Shampoo","Pet Collar","Pet Leash","Pet Toys","Pet Bowl","Pet Bed","Pet Treats","Pet Brush","Pet Nail Cutter","Pet Spray","Pet Vitamins","Pet Litter","Pet Cage","Pet Carrier","Pet Blanket","Pet Soap","Pet Towel","Pet Diapers","Pet Chew","Pet Harness","Pet Clothes","Pet Training Pad","Pet Perfume"};
		String healthItems[]={"Thermometer","BP Monitor","Glucometer","First Aid Kit","Bandage","Cotton","Antiseptic","Pain Balm","ORS","Face Mask","Hand Gloves","Sanitizer","Vitamins","Protein Powder","Herbal Tablets","Pain Spray","Heating Pad","Hot Water Bag","Nebulizer","Pulse Oximeter","Eye Drops","Ear Drops","Weighing Scale","Medical Tape","Inhaler"};
		String foodItems[]={"Rice","Wheat","Dal","Sugar","Salt","Oil","Milk","Curd","Butter","Ghee","Bread","Eggs","Tea","Coffee","Biscuits","Noodles","Pasta","Flour","Rava","Poha","Cornflakes","Jam","Honey","Sauce","Pickle"};
		String vegetables[]={"Potato","Tomato","Onion","Carrot","Beans","Cabbage","Cauliflower","Brinjal","Capsicum","Spinach","Beetroot","Radish","Cucumber","Pumpkin","Bottle Gourd","Bitter Gourd","Drumstick","Peas","Garlic","Ginger","Green Chilli","Mushroom","Sweet Corn","Broccoli","Lettuce"};
		String fruits[]={"Apple","Banana","Orange","Mango","Grapes","Pineapple","Papaya","Watermelon","Guava","Pear","Strawberry","Blueberry","Kiwi","Pomegranate","Cherry","Plum","Peach","Litchi","Fig","Avocado","Custard Apple","Jackfruit","Raspberry","Coconut","Dragon Fruit"};
		String snacks[]={"Chips","Namkeen","Popcorn","Peanuts","Nachos","Cookies","Biscuits","Chocolate","Candy","Wafers","Murukku","Mixture","Khakhra","Roasted Chana","Corn Puffs","Energy Bar","Protein Bar","Salted Nuts","Dry Fruits","Fruit Snacks","Rice Cakes","Cheese Balls","Crackers","Granola","Trail Mix"};
		String drinks[]={"Tea","Coffee","Green Tea","Milkshake","Juice","Soft Drink","Energy Drink","Soda","Lassi","Buttermilk","Cold Coffee","Hot Chocolate","Mocktail","Iced Tea","Lemon Juice","Coconut Water","Flavored Water","Sports Drink","Herbal Tea","Black Coffee","Latte","Cappuccino","Espresso","Americano","Milk"};
		String bakery[]={"Bread","Bun","Cake","Pastry","Cookies","Brownie","Donut","Muffin","Cupcake","Rusk","Garlic Bread","Pizza Base","Burger Bun","Roll","Puff","Fruit Cake","Sponge Cake","Plum Cake","Dry Cake","Toast","Cheese Bread","Wheat Bread","Milk Bread","Multigrain Bread","Jam Roll"};
		String dairy[]={"Milk","Curd","Butter","Cheese","Paneer","Ghee","Cream","Flavored Milk","Yogurt","Buttermilk","Ice Cream","Milk Powder","Condensed Milk","Lassi","Milkshake","Cheese Slice","Cheese Spread","Whipped Cream","Custard","Khoa","Curd Drink","Low Fat Milk","Organic Milk","Almond Milk","Soy Milk"};
		String clothes[]={"TShirt","Shirt","Jeans","Pant","Kurti","Saree","Dress","Skirt","Shorts","Jacket","Sweater","Hoodie","Night Dress","Innerwear","Socks","Scarf","Cap","Belt","Dupatta","Raincoat","Blazer","Coat","Leggings","Tracksuit","Palazzo"};
		String footwear[]={"Shoes","Sandals","Slippers","Sneakers","Boots","Heels","Flats","Loafers","FlipFlops","Sports Shoes","School Shoes","Formal Shoes","Casual Shoes","Party Shoes","Running Shoes","Crocs","Slides","Clogs","Wedges","Ballet Flats","Espadrilles","Derby","Oxford","Monk Shoes","Sliders"};
	    System.out.println("\nThe no of cosmetics:"+cosmetics.length);
        for(String item :cosmetics){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of toiletries :"+toiletries.length);
        for(String item :toiletries){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of cleaning Items :"+cleaningItems.length);
        for(String item :cleaningItems){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of kitchen Items :"+kitchenItems.length);
        for(String item :kitchenItems){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of stationery :"+stationery.length);
        for(String item :stationery){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no toys :"+toys.length);
        for(String item :toys){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of electronics:"+electronics.length);
        for(String item :electronics){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of meat Items :"+meatItems.length);
        for(String item :meatItems){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of baby Items :"+babyItems.length);
        for(String item :babyItems){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of pet Items :"+petItems.length);
        for(String item :petItems){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no health Items : "+healthItems.length);
        for(String item :healthItems){ 
		System.out.println(item);
		}
		System.out.println("The no of food items count:"+foodItems.length);
        for(String item :foodItems){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of vegetables :"+vegetables.length);
        for(String item :vegetables){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of fruits :"+fruits.length);
        for(String item :fruits){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of snacks :"+snacks.length);
        for(String item :snacks){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of drinks:"+drinks.length);
        for(String item :drinks){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of bakery :"+bakery.length);
        for(String item :bakery){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of dairy :"+dairy.length);
        for(String item :dairy){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of clothes:"+clothes.length);
        for(String item :clothes){ 
		System.out.println(item); 
		}
        System.out.println("\nThe no of footwear:"+footwear.length);
        for(String item :footwear){ 
		System.out.println(item); 
		}
	}
}
