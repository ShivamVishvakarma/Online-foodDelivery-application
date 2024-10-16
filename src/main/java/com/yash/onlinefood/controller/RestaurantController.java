/*
 * package com.yash.onlinefood.controller;
 * 
 * import java.io.IOException; import java.sql.SQLException; import
 * java.text.ParseException; import java.text.SimpleDateFormat; import
 * java.util.List; import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.yash.onlinefood.pojo.Restaurant; import
 * com.yash.onlinefood.repository.RestaurantRepo; import
 * com.yash.onlinefood.repositoryImpl.RestaurantRepoImpl;
 * 
 * @WebServlet("/restaurant/*") public class RestaurantController extends
 * HttpServlet { private RestaurantRepo restaurantDAO;
 * 
 * public void init() { restaurantDAO = new RestaurantRepoImpl(); }
 * 
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { doGet(request, response); }
 * 
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { String action =
 * request.getPathInfo();
 * 
 * try { switch (action) { case "/new": showNewForm(request, response); break;
 * case "/insert": insertRestaurant(request, response); break; case "/delete":
 * deleteRestaurant(request, response); break; case "/edit":
 * showEditForm(request, response); break; case "/update":
 * updateRestaurant(request, response); break; default: listRestaurants(request,
 * response); break; } } catch (SQLException ex) { throw new
 * ServletException(ex); } }
 * 
 * private void listRestaurants(HttpServletRequest request, HttpServletResponse
 * response) throws SQLException, IOException, ServletException {
 * List<Restaurant> listRestaurant = restaurantDAO.getAllRestaurants();
 * request.setAttribute("listRestaurant", listRestaurant);
 * request.getRequestDispatcher("/restaurant-list.jsp").forward(request,
 * response); }
 * 
 * private void showNewForm(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * request.getRequestDispatcher("/restaurant-form.jsp").forward(request,
 * response); }
 * 
 * private void showEditForm(HttpServletRequest request, HttpServletResponse
 * response) throws SQLException, ServletException, IOException { int id =
 * Integer.parseInt(request.getParameter("id")); Restaurant existingRestaurant =
 * restaurantDAO.getRestaurant(id); request.setAttribute("restaurant",
 * existingRestaurant);
 * request.getRequestDispatcher("/restaurant-form.jsp").forward(request,
 * response); }
 * 
 * private void insertRestaurant(HttpServletRequest request, HttpServletResponse
 * response) throws SQLException, IOException { Restaurant newRestaurant =
 * getRestaurantFromRequest(request);
 * restaurantDAO.addRestaurant(newRestaurant); response.sendRedirect("list"); }
 * 
 * private void updateRestaurant(HttpServletRequest request, HttpServletResponse
 * response) throws SQLException, IOException { Restaurant restaurant =
 * getRestaurantFromRequest(request);
 * restaurantDAO.updateRestaurant(restaurant); response.sendRedirect("list"); }
 * 
 * private void deleteRestaurant(HttpServletRequest request, HttpServletResponse
 * response) throws SQLException, IOException { int id =
 * Integer.parseInt(request.getParameter("id"));
 * restaurantDAO.deleteRestaurant(id); response.sendRedirect("list"); }
 * 
 * private Restaurant getRestaurantFromRequest(HttpServletRequest request) {
 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Restaurant
 * restaurant = new Restaurant(); try {
 * restaurant.setId(Integer.parseInt(request.getParameter("id")));
 * restaurant.setOwner(request.getParameter("owner"));
 * restaurant.setName(request.getParameter("name"));
 * restaurant.setDescription(request.getParameter("description"));
 * restaurant.setCuisineType(request.getParameter("cuisineType"));
 * restaurant.setAddress(request.getParameter("address"));
 * restaurant.setContactInformation(Integer.parseInt(request.getParameter(
 * "contactInformation")));
 * restaurant.setOpeningHours(request.getParameter("openingHours"));
 * restaurant.setReviews(request.getParameter("reviews"));
 * restaurant.setOrders(Integer.parseInt(request.getParameter("orders")));
 * restaurant.setNumRating(Double.parseDouble(request.getParameter("numRating"))
 * ); restaurant.setRegistrationDate(sdf.parse(request.getParameter(
 * "registrationDate")));
 * restaurant.setOpen(Boolean.parseBoolean(request.getParameter("open")));
 * restaurant.setFoods(request.getParameter("foods")); } catch (ParseException
 * e) { e.printStackTrace(); } return restaurant; } }
 */