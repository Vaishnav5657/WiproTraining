import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import jsPDF from 'jspdf';

@Component({
  selector: 'app-success',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './success.html'
})
export class SuccessComponent implements OnInit {
  bookingId!: number;
  name = '';
  email = '';
  amount = 0;
  status = 'Paid';

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.bookingId = Number(this.route.snapshot.paramMap.get('bookingId'));

    this.name = 'Rohan';
    this.email = 'Rohan@gmail.com';
    this.amount = 5500; // Example: Rs. 5000
    this.status = 'Paid';
  }

  download() {
    const doc = new jsPDF();
    // doc.text(`Ticket - Booking #${this.bookingId}`, 10, 10);
    // doc.text(`Thank you for flying with us!`, 10, 20);
    // doc.save('ticket.pdf');

    doc.setFontSize(16);
    doc.text('✈️ Flight Booking Ticket', 70, 15);

    doc.setFontSize(12);
    doc.text(`Booking ID: ${this.bookingId}`, 10, 30);
    doc.text(`Name: ${this.name}`, 10, 40);
    doc.text(`Email: ${this.email}`, 10, 50);
    doc.text(`Amount Paid: ₹${this.amount}`, 10, 60);
    doc.text(`Payment Status: ${this.status}`, 10, 70);

    doc.line(10, 80, 200, 80); // horizontal separator
    doc.text(`Thank you for flying with us!`, 10, 95);

    doc.save(`ticket_${this.bookingId}.pdf`);
  }
}
