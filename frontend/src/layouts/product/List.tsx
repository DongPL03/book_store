import React from "react";
import BookProps from "./components/BookProps";
import Book from "../../models/Book";

const List: React.FC = () => {
  const books: Book[] = [
    {
      id: 1,
      title: "Book 1",
      description: "Description for Book 1",
      originalPrice: 50000,
      price: 45000,
      imageUrl: "./../../images/books/anh_1.jpg", 
    },
    {
      id: 1,
      title: "Book 1",
      description: "Description for Book 2",
      originalPrice: 50000,
      price: 45000,
      imageUrl: "./../../images/books/anh_2.jpg",
    },
    {
      id: 1,
      title: "Book 1",
      description: "Description for Book 3",
      originalPrice: 50000,
      price: 45000,
      imageUrl: "./../../images/books/anh_3.jpg",
    },
    {
      id: 1,
      title: "Book 1",
      description: "Description for Book 1",
      originalPrice: 50000,
      price: 45000,
      imageUrl: "./../../images/books/anh_3.jpg",
    },
    {
      id: 1,
      title: "Book 1",
      description: "Description for Book 2",
      originalPrice: 50000,
      price: 45000,
      imageUrl: "./../../images/books/anh_4.jpg",
    },
  ];
  return (
    <div className="container">
      <div className="row mt-4">
        {books.map((book) => (

          <BookProps key={book.id} book={book} />
        ))}
      </div>
    </div>
  );
};

export default List;
